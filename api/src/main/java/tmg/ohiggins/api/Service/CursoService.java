package tmg.ohiggins.api.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tmg.ohiggins.api.Model.Curso;
import tmg.ohiggins.api.Repository.CursoRepository;
import java.util.List;


@Service

public class CursoService {
    @Autowired
    private CursoRepository cursoRepository;

    public List<Curso> getAllCurso() {
        return cursoRepository.findAll();
    }
    public Curso getCursoById(Integer id) {
        return cursoRepository.findById(id).orElse(null);
    }

    public Curso saveCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    public Curso updateCurso(Integer id, Curso curso) {
        Curso existingCurso = cursoRepository.findById(id).orElse(null);
        if (existingCurso != null) {
           existingCurso.setIdCurso(curso.getIdCurso());
           existingCurso.setCodigoCurso(curso.getCodigoCurso());
           existingCurso.setNombreCurso(curso.getNombreCurso());
           existingCurso.setDescripcion(curso.getDescripcion());
           return cursoRepository.save(existingCurso);
        }
        return null;
    }

    public String deleteCurso(Integer id) {
        cursoRepository.deleteById(id);
        return "Curso con ID " + id + " eliminada correctamente.";
    }



}

