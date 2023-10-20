package encuesta.com.it.demo.services;


import java.util.Map;


import encuesta.com.it.demo.model.PersonaModel;

public interface PersonaService {
    public abstract Map<String, String> addPersona(PersonaModel persona);
    public abstract PersonaModel findByEmail(String Email);
    
}
