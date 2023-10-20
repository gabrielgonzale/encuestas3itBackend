package encuesta.com.it.demo.services;

import java.util.List;

import encuesta.com.it.demo.entity.Encuesta;
import encuesta.com.it.demo.model.EncuestaModel;



public interface EncuestaService {

    public abstract Encuesta addEncuesta(EncuestaModel encuestaModel);

    public abstract List<Encuesta> findAll();
    
}
