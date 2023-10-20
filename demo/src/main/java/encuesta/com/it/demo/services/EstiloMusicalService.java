package encuesta.com.it.demo.services;





import java.util.List;


import encuesta.com.it.demo.entity.EstiloMusical;
import encuesta.com.it.demo.model.EstiloMusicalModel;

public interface EstiloMusicalService  {

    public abstract EstiloMusical addEstiloMusica(EstiloMusicalModel encuestaModel);

    public abstract EstiloMusicalModel findById(Long id);
    public abstract List<EstiloMusical> findAll();
    public abstract EstiloMusical save(EstiloMusical estiloMusicalModel);
    
}
