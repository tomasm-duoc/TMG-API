package tmg.ohiggins.api.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tmg.ohiggins.api.Model.Nota;
import tmg.ohiggins.api.Repository.NotaRepository;

@Service
public class NotaService {

    @Autowired
    private NotaRepository notaRepository;

    public List<Nota> getAllNotas() {
        return notaRepository.findAll();
    }

    public Nota getNotaById(Integer id) {
        return notaRepository.findById(id).orElse(null);
    }

    public Nota saveNota(Nota nota) {
        return notaRepository.save(nota);
    }

    public Nota updateNota(Integer id, Nota nota) {
        Nota existingNota = notaRepository.findById(id).orElse(null);
        if (existingNota != null) {
            existingNota.setCurso(nota.getCurso());
            existingNota.setRol(nota.getRol());
            existingNota.setNota(nota.getNota());
            existingNota.setObservaciones(nota.getObservaciones());
            return notaRepository.save(existingNota);
        }
        return null;
    }

    public String deleteNota(Integer id) {
        notaRepository.deleteById(id);
        return "Nota con ID " + id + " eliminada correctamente.";
    }



}
