package tmg.ohiggins.api.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tmg.ohiggins.api.Repository.AnotacionRepository;
import tmg.ohiggins.api.Model.Anotacion;


@Service
public class AnotacionService {
    
    @Autowired
    private AnotacionRepository anotacionRepository;
    
    public List<Anotacion> getAllAnotaciones() {
        return anotacionRepository.findAll();
    }
    
    public Anotacion getAnotacionById(Integer id) {
        return anotacionRepository.findById(id).orElse(null);
    }
    
    public Anotacion saveAnotacion(Anotacion anotacion) {
        anotacion.setFecha(LocalDate.now());
        anotacion.setHora(LocalTime.now());
        return anotacionRepository.save(anotacion);
    }

    public Anotacion updateAnotacion(Integer id, Anotacion anotacion) {
        Anotacion existingAnotacion = anotacionRepository.findById(id).orElse(null);
        if (existingAnotacion != null) {
            existingAnotacion.setRol(anotacion.getRol());
            existingAnotacion.setTipoRegistro(anotacion.getTipoRegistro());
            existingAnotacion.setDescripcion(anotacion.getDescripcion());
            return anotacionRepository.save(existingAnotacion);
        }
        return null;
    }

    public String deleteAnotacion(Integer id) {
        anotacionRepository.deleteById(id);
        return "Anotacion con ID " + id + " eliminada correctamente.";
    }
}
