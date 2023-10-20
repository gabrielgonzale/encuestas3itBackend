package encuesta.com.it.demo.converter;




import org.springframework.stereotype.Component;

import encuesta.com.it.demo.entity.Encuesta;
import encuesta.com.it.demo.entity.EstiloMusical;
import encuesta.com.it.demo.entity.Persona;
import encuesta.com.it.demo.model.EncuestaModel;
import encuesta.com.it.demo.model.EstiloMusicalModel;
import encuesta.com.it.demo.model.PersonaModel;

@Component("ModelEntityConverter")
public class ModelEntityConverter {


 

    public Persona personaModelToEntity(PersonaModel personaModel) {
        Persona persona = new Persona();
        persona.setEmail(personaModel.getEmail()); 
        return persona;
    }
    public EstiloMusical estiloMusicalModelToEntity(EstiloMusicalModel estiloMusicalModel) {
        EstiloMusical estiloMusical = new EstiloMusical();
        estiloMusical.setEstiloMusical(estiloMusicalModel.getEstiloMusical());
        return estiloMusical;
    }

    public Encuesta encuestaModelToEntity(EncuestaModel respuestaModel) {
        Encuesta respuesta = new Encuesta();
        Persona persona = new Persona();
        persona.setEmail(respuestaModel.getPersona().getEmail());
        respuesta.setPersona(persona);

        respuesta.setEstilomusical_id(respuestaModel.getEstilomusical_id());
        return respuesta;
    }

    public PersonaModel personaEntityToModel(Persona persona) {
        PersonaModel personaModel = new PersonaModel();
        personaModel.setEmail(persona.getEmail());
        return personaModel;
    }

    public EstiloMusicalModel estiloMusicalEntityToModel(EstiloMusical estiloMusical) {
        EstiloMusicalModel estiloMusicalModel = new EstiloMusicalModel();
        estiloMusicalModel.setEstiloMusical(estiloMusical.getEstiloMusical());
        estiloMusicalModel.setId(estiloMusical.getId());
        
        return estiloMusicalModel;
    }

    public EncuestaModel encuestaEntityToModel(Encuesta respuesta) {
        EncuestaModel encuestaModel = new EncuestaModel();
        encuestaModel.setPersona( personaEntityToModel( respuesta.getPersona()));
        encuestaModel.setEstilomusical_id(respuesta.getEstilomusical_id());
        return encuestaModel;
    }
}
