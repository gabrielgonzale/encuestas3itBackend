package encuesta.com.it.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import encuesta.com.it.demo.entity.EstiloMusical;

import encuesta.com.it.demo.services.impl.EstiloMusicalServiceImpl;

@RestController
@RequestMapping("/estiloMusical")
public class EstiloMusicalController {

    @Autowired
    @Qualifier("EstiloMusicalServiceImpl")
    EstiloMusicalServiceImpl estiloMusicalServiceImpl;

    @GetMapping("/estilosMusicales")
    public ResponseEntity<List<EstiloMusical>> listarEncuestas() {

        return ResponseEntity.ok(estiloMusicalServiceImpl.findAll());

    }

    @PostMapping("/guardar")
    public EstiloMusical registrarEstiloMusical(@RequestBody EstiloMusical estiloMusical ){
        
        return estiloMusicalServiceImpl.save(estiloMusical);

    }

}
