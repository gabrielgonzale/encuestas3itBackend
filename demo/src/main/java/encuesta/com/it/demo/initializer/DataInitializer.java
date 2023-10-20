package encuesta.com.it.demo.initializer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import encuesta.com.it.demo.entity.EstiloMusical;
import encuesta.com.it.demo.repository.EstiloMusicalRepository;

@Component
public class DataInitializer implements ApplicationRunner {
    @Autowired
    @Qualifier("EstiloMusicalRepository")
    EstiloMusicalRepository estiloMusicalRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        
        EstiloMusical estiloMusical1 = new EstiloMusical();
        estiloMusical1.setEstiloMusical("Rock");

        EstiloMusical estiloMusical2 = new EstiloMusical();
        estiloMusical2.setEstiloMusical("Jazz");

        EstiloMusical estiloMusical3 = new EstiloMusical();
        estiloMusical3.setEstiloMusical("Reggeaton");

        EstiloMusical estiloMusical4 = new EstiloMusical();
        estiloMusical4.setEstiloMusical("Blue");

        EstiloMusical estiloMusical5 = new EstiloMusical();
        estiloMusical5.setEstiloMusical("Clásica");

        EstiloMusical estiloMusical6 = new EstiloMusical();
        estiloMusical6.setEstiloMusical("Pop");

        EstiloMusical estiloMusical7 = new EstiloMusical();
        estiloMusical7.setEstiloMusical("Metal");

        estiloMusicalRepository.save(estiloMusical1);
        estiloMusicalRepository.save(estiloMusical2);
        estiloMusicalRepository.save(estiloMusical3);
        estiloMusicalRepository.save(estiloMusical4);
        estiloMusicalRepository.save(estiloMusical5);
        estiloMusicalRepository.save(estiloMusical6);
        estiloMusicalRepository.save(estiloMusical7);
        


    }

}
