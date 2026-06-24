package tmg.ohiggins.api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tmg.ohiggins.api.Model.Nota;
import tmg.ohiggins.api.Service.NotaService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/notas")
public class NotaController {
    @Autowired
    private NotaService notaService;

    @GetMapping()
    public List<Nota> getAllNotas() {
        return notaService.getAllNotas();
    }

    @GetMapping("/{ID}")
    public Nota getNotaById(@RequestParam Integer id) {
        return notaService.getNotaById(id);
    }

    @PostMapping()
    public Nota saveNota(@RequestBody Nota nota) {
        return notaService.saveNota(nota);
    }

    @PutMapping("/{id}")
    public Nota updateNota(@PathVariable Integer id, @RequestBody Nota nota) {
        return notaService.updateNota(id, nota);
    }

    @DeleteMapping("/{id}")
    public String deleteNota(@PathVariable Integer id) {
        return notaService.deleteNota(id);
    }
    
    
    
}
