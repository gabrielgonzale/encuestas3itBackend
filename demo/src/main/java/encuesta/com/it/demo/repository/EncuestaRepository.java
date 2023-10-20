package encuesta.com.it.demo.repository;

import java.io.Serializable;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import encuesta.com.it.demo.entity.Encuesta;

@Repository("EncuestaRepository")
public interface EncuestaRepository extends JpaRepository<Encuesta, Serializable>{

    
    
}
