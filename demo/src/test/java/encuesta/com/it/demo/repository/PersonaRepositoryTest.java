package encuesta.com.it.demo.repository;





import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import encuesta.com.it.demo.entity.Persona;


@DataJpaTest
public class PersonaRepositoryTest {

    @Autowired
    PersonaRepository personaRepository;

    @DisplayName("Test para guardar una persona y revisar si el Email es igual")
    @Test
    void guardarEmpleado(){
        Persona persona = new Persona("gabriel@gmail.com");

        Persona personaGuardada = personaRepository.save(persona);

        assertThat(personaGuardada).isNotNull();
        assertThat(personaGuardada.getEmail()).isEqualTo("gabriel@gmail.com");

        
    }
    
}
