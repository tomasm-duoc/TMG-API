package tmg.ohiggins.api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tmg.ohiggins.api.Model.Anotacion;
import tmg.ohiggins.api.Service.AnotacionService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/anotaciones")
public class AnotacionController {

    @Autowired
    private AnotacionService anotacionService;


    @GetMapping
    public List<Anotacion> getAllAnotaciones() {
        return anotacionService.getAllAnotaciones();
    }

    @GetMapping("/{id}")
    public Anotacion getAnotacionById(@PathVariable Integer id) {
        return anotacionService.getAnotacionById(id);
    }

    @PostMapping()
    public Anotacion saveAnotacion(@RequestBody Anotacion anotacion) {
        return anotacionService.saveAnotacion(anotacion);
    }

    @PutMapping("/{id}")
    public Anotacion updateAnotacion(@PathVariable Integer id, @RequestBody Anotacion anotacion) {
        return anotacionService.updateAnotacion(id, anotacion);
    }

    @DeleteMapping("/{id}")
    public String deleteAnotacion(@PathVariable Integer id) {
        return anotacionService.deleteAnotacion(id);
    }

}
