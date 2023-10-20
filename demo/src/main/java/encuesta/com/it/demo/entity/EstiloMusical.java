package encuesta.com.it.demo.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


import jakarta.persistence.Table;

@Entity
@Table(name = "EstiloMusical")
public class EstiloMusical {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "estiloMusical")
    private String estiloMusical;
        
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEstiloMusical() {
        return estiloMusical;
    }

    public void setEstiloMusical(String estiloMusical) {
        this.estiloMusical = estiloMusical;
    }

    public EstiloMusical(Long id, String estiloMusical) {
        this.id = id;
        this.estiloMusical = estiloMusical;
    }

    public EstiloMusical() {

    }

    


}
