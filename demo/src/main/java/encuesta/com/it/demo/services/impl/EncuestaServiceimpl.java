package encuesta.com.it.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import encuesta.com.it.demo.converter.ModelEntityConverter;
import encuesta.com.it.demo.entity.Encuesta;
import encuesta.com.it.demo.model.EncuestaModel;
import encuesta.com.it.demo.repository.EncuestaRepository;
import encuesta.com.it.demo.services.EncuestaService;

@Service("EncuestaServiceimpl")
public class EncuestaServiceimpl implements EncuestaService {

    @Autowired
    @Qualifier("EncuestaRepository")
    public EncuestaRepository encuestaRepository;

    @Autowired
    @Qualifier("ModelEntityConverter")
    public ModelEntityConverter modelEntityConverter;

    @Override
    public Encuesta addEncuesta(EncuestaModel encuesta) {

        Encuesta encuestasave = modelEntityConverter.encuestaModelToEntity(encuesta);

        return encuestaRepository.saveAndFlush(encuestasave);

    }

    @Override
    public List<Encuesta> findAll() {
        return encuestaRepository.findAll();
    }

}
