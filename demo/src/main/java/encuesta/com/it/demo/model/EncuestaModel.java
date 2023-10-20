package encuesta.com.it.demo.model;





public class EncuestaModel {
    
    private Long id;
    private PersonaModel persona;
    private Long estilomusical_id;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public PersonaModel getPersona() {
        return persona;
    }
    public void setPersona(PersonaModel persona) {
        this.persona = persona;
    }
   
    public EncuestaModel(Long id, PersonaModel persona, Long estilomusical_id) {
        this.id = id;
        this.persona = persona;
        this.estilomusical_id = estilomusical_id;
    }
    public Long getEstilomusical_id() {
        return estilomusical_id;
    }
    public void setEstilomusical_id(Long estilomusical_id) {
        this.estilomusical_id = estilomusical_id;
    }
    public EncuestaModel() {
    }
    
    
    
}
