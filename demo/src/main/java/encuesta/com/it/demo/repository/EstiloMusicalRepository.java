package encuesta.com.it.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import encuesta.com.it.demo.entity.EstiloMusical;



@Repository("EstiloMusicalRepository")
public interface EstiloMusicalRepository  extends JpaRepository<EstiloMusical, Serializable>{

    EstiloMusical  findById(Long id);
    
}
