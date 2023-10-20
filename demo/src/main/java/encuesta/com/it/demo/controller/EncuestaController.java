package encuesta.com.it.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import encuesta.com.it.demo.entity.Encuesta;

import encuesta.com.it.demo.exception.EmailDuplicadoException;
import encuesta.com.it.demo.model.EncuestaModel;

import encuesta.com.it.demo.model.PersonaModel;
import encuesta.com.it.demo.model.RespuestaModel;
import encuesta.com.it.demo.services.impl.EncuestaServiceimpl;
import encuesta.com.it.demo.services.impl.EstiloMusicalServiceImpl;
import encuesta.com.it.demo.services.impl.PersonaServiceImpl;

@RestController
@RequestMapping("/rest")
public class EncuestaController {

    @Autowired
    @Qualifier("EncuestaServiceimpl")
    EncuestaServiceimpl encuestaServiceimpl;

    @Autowired
    @Qualifier("PersonaServiceImpl")
    PersonaServiceImpl personaServiceImpl;

    @Autowired
    @Qualifier("EstiloMusicalServiceImpl")
    EstiloMusicalServiceImpl estiloMusicalServiceImpl;

    @PostMapping("/registrarEncuesta")
    public ResponseEntity<Object> registrarEncuesta(@RequestBody RespuestaModel respuestaDTO) {
        try {
            PersonaModel personaModel = new PersonaModel();
            personaModel.setEmail(respuestaDTO.getEmail());
            Map<String, String> data = new HashMap<>();

            data = personaServiceImpl.addPersona(personaModel);

            System.out.println(respuestaDTO.getId_estiloMusical());

            if ("ok".equals(data.get("status"))) {
                EncuestaModel encuestaModel = new EncuestaModel();
                encuestaModel.setPersona(personaModel);
                encuestaModel.setEstilomusical_id(respuestaDTO.getId_estiloMusical());
                encuestaServiceimpl.addEncuesta(encuestaModel);
                return new ResponseEntity<>(data, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(data, HttpStatus.OK);
            }
        } catch (EmailDuplicadoException e) {

            return ResponseEntity.badRequest().body(e.getMessage());
        }

    }

    @GetMapping("/encuestas")
    public ResponseEntity<List<Encuesta>> listarEncuestas() {

        return ResponseEntity.ok(encuestaServiceimpl.findAll());
    }

}
