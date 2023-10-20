package encuesta.com.it.demo.service;

import org.junit.Test;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import encuesta.com.it.demo.entity.Encuesta;
import encuesta.com.it.demo.repository.EncuestaRepository;

import encuesta.com.it.demo.services.impl.EncuestaServiceimpl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

import java.util.Collections;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class EncuestaServiceTest {



    @Mock
    private EncuestaRepository encuestaRepository;

   
    @InjectMocks
    private EncuestaServiceimpl encuestaService;


    
    @Test
    public void listarEncuestasVacia(){

        // given
       given(encuestaService.findAll()).willReturn(Collections.emptyList());

       //when

       List<Encuesta> listaEncuesta = encuestaService.findAll();

       //then
       assertThat(listaEncuesta).isEmpty();
       assertThat(listaEncuesta).isEqualTo(0);


    }
    
}
