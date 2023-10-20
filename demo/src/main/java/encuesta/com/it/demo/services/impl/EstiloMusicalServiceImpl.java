package encuesta.com.it.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import encuesta.com.it.demo.converter.ModelEntityConverter;
import encuesta.com.it.demo.entity.EstiloMusical;
import encuesta.com.it.demo.model.EstiloMusicalModel;
import encuesta.com.it.demo.repository.EstiloMusicalRepository;
import encuesta.com.it.demo.services.EstiloMusicalService;

@Service("EstiloMusicalServiceImpl")
public class EstiloMusicalServiceImpl implements EstiloMusicalService {

    @Autowired
    @Qualifier("EstiloMusicalRepository")
    EstiloMusicalRepository estiloMusicalRepository;

    @Autowired
    @Qualifier("ModelEntityConverter")
    public ModelEntityConverter modelEntityConverter;

    @Override
    public EstiloMusical addEstiloMusica(EstiloMusicalModel EstiloMusical) {

        EstiloMusical estilomusicalsave = modelEntityConverter.estiloMusicalModelToEntity(EstiloMusical);
        return estiloMusicalRepository.save(estilomusicalsave);
    }

    @Override
    public EstiloMusicalModel findById(Long id) {
        EstiloMusical estiloMusical = estiloMusicalRepository.findById(id);
        
        return modelEntityConverter.estiloMusicalEntityToModel(estiloMusical);

    }

    @Override
    public List<EstiloMusical> findAll() {
        
       return estiloMusicalRepository.findAll();

    }

    @Override
    public EstiloMusical save(EstiloMusical estiloMusical) {
       
        
        return estiloMusicalRepository.save(estiloMusical);
    }

}
