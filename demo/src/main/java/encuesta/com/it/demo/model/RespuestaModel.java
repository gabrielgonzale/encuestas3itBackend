package encuesta.com.it.demo.model;

public class RespuestaModel {

    private String email;
    private Long id_estiloMusical;
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Long getId_estiloMusical() {
        return id_estiloMusical;
    }
    public void setId_estiloMusical(Long id_estiloMusical) {
        this.id_estiloMusical = id_estiloMusical;
    }
    public RespuestaModel() {
    }
    public RespuestaModel(String email, Long id_estiloMusical) {
        this.email = email;
        this.id_estiloMusical = id_estiloMusical;
    }

    
    
}
