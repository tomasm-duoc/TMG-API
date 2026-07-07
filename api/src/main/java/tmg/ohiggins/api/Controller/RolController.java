package tmg.ohiggins.api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tmg.ohiggins.api.Model.Rol;
import tmg.ohiggins.api.Service.RolService;

@RestController
@RequestMapping("/roles")
public class RolController {

    @Autowired
    private RolService rolService;

    @GetMapping
    public List<Rol> getAllRoles() {
        return rolService.getAllRoles();
    }

    @GetMapping("/{id}")
    public Rol getRolById(@PathVariable Integer id) {
        return rolService.getRolById(id);
    }

    @PostMapping
    public Rol saveRol(@RequestBody Rol rol) {
        return rolService.saveRol(rol);
    }

    @PutMapping("/{id}")
    public Rol updateRol(@PathVariable Integer id, @RequestBody Rol rol) {
        return rolService.updateRol(id, rol);
    }

    @DeleteMapping("/{id}")
    public String deleteRol(@PathVariable Integer id) {
        return rolService.deleteRol(id);
    }
}
