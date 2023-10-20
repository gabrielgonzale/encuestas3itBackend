package encuesta.com.it.demo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "persona")
public class Persona {
    
    @Id
    @Column(name = "email", unique = true)
    private String email;

    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Encuesta> encuesta;

    public List<Encuesta> getEncuesta() {
        return encuesta;
    }

    public void setEncuesta(List<Encuesta> encuesta) {
        this.encuesta = encuesta;
    }

    public Persona() {
    }
     public Persona(String email) {
        this.email = email;
    }


  

    public Persona(String email, List<Encuesta> encuesta) {
        this.email = email;
        this.encuesta = encuesta;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
