package encuesta.com.it.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;

@Entity
@Table(name = "Encuesta")
public class Encuesta {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne()
    @JoinColumn(name = "persona_id", referencedColumnName = "email")
    @JsonBackReference
    private Persona persona;

    @Column(name = "estilomusical_id")
    private Long estilomusical_id;

    public Long getId() {
        return id;
    }

    public Long getEstilomusical_id() {
        return estilomusical_id;
    }

    public void setEstilomusical_id(Long estilomusical_id) {
        this.estilomusical_id = estilomusical_id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

   

    

    public Encuesta(Long id, Persona persona, Long estilomusical_id) {
        this.id = id;
        this.persona = persona;
        this.estilomusical_id = estilomusical_id;
    }

    public Encuesta() {
    }

   

}
