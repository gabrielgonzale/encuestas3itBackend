package encuesta.com.it.demo.services.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import encuesta.com.it.demo.converter.ModelEntityConverter;
import encuesta.com.it.demo.entity.Persona;

import encuesta.com.it.demo.model.PersonaModel;
import encuesta.com.it.demo.repository.PersonaRepository;
import encuesta.com.it.demo.services.PersonaService;

@Service("PersonaServiceImpl")
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    @Qualifier("PersonaRepository")
    PersonaRepository personaRepository;

    @Autowired
    @Qualifier("ModelEntityConverter")
    public ModelEntityConverter modelEntityConverter;

    @Override
    public Map<String, String> addPersona(PersonaModel persona) {
        Persona personExistente = personaRepository.findByEmail(persona.getEmail());
        Map<String, String> data = new HashMap<>();
        if (personExistente != null) {
            System.out.println("Entre aqui donde la persona existe");
            data.put("status","error");
            data.put("Respuesta", "Correo electrónico duplicado");
            return data;
            
        } else {
            System.out.println("Entre aqui donde la no persona existe");
            Persona p = modelEntityConverter.personaModelToEntity(persona);
             personaRepository.saveAndFlush(p);
            data.put("status","ok");
            data.put("Respuesta", "Encuesta Guardada con éxito");
            return data;

        }

    }

    @Override
    public PersonaModel findByEmail(String Email) {

        Persona p = new Persona();
        p = personaRepository.findByEmail(Email);
        return modelEntityConverter.personaEntityToModel(p);

    }

}
