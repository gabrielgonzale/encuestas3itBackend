package encuesta.com.it.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import java.io.Serializable;
import encuesta.com.it.demo.entity.Persona;



@Repository("PersonaRepository")
public interface PersonaRepository extends JpaRepository<Persona, Serializable> {

    Persona  findByEmail(String email);

}
