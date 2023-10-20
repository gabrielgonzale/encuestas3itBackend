package encuesta.com.it.demo.model;



public class EstiloMusicalModel {

    private Long id;
    private String estiloMusical;
    private Long estilomusical_id;

    

    public EstiloMusicalModel(Long id, String estiloMusical, Long estilomusical_id) {
        this.id = id;
        this.estiloMusical = estiloMusical;
        this.estilomusical_id = estilomusical_id;
    }

    public String getEstiloMusical() {
        return estiloMusical;
    }

    public void setEstiloMusical(String estiloMusical) {
        this.estiloMusical = estiloMusical;
    }

    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    

    public EstiloMusicalModel() {
    }

    public Long getEstilomusical_id() {
        return estilomusical_id;
    }

    public void setEstilomusical_id(Long estilomusical_id) {
        this.estilomusical_id = estilomusical_id;
    }

}
