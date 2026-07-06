package tmg.ohiggins.api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import tmg.ohiggins.api.Model.Curso;
import tmg.ohiggins.api.Service.CursoService;

@RestController
@RequestMapping("/Cursos")
public class CursoController {
    @Autowired
    private CursoService cursoService;

    @GetMapping()
    public List<Curso> getAllCurso() {
        return cursoService.getAllCurso();
    }

    @GetMapping("/{id}")
    public Curso getCursoById(@PathVariable Integer id) {
        return cursoService.getCursoById(id);
    }

    @PostMapping()
    public Curso saveCurso(@RequestBody Curso curso) {
        return cursoService.saveCurso(curso);
    }

    @PutMapping("/{id}")
    public Curso updateCurso(@PathVariable Integer id, @RequestBody Curso curso) {
        return cursoService.updateCurso(id, curso);
    }

    @DeleteMapping("/{id}")
    public String deleteNota(@PathVariable Integer id) {
        return cursoService.deleteCurso(id);
    }
}

