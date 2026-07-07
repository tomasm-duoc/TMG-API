package tmg.ohiggins.api.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tmg.ohiggins.api.Model.Rol;
import tmg.ohiggins.api.Repository.RolRepository;

@Service
public class RolService {

    @Autowired
    private RolRepository rolRepository;

    public List<Rol> getAllRoles() {
        return rolRepository.findAll();
    }

    public Rol getRolById(Integer id) {
        return rolRepository.findById(id).orElse(null);
    }

    public Rol saveRol(Rol rol) {
        return rolRepository.save(rol);
    }

    public Rol updateRol(Integer id, Rol rol) {
        Rol existingRol = rolRepository.findById(id).orElse(null);
        if (existingRol != null) {
            existingRol.setRol_nombre(rol.getRol_nombre());
            return rolRepository.save(existingRol);
        }
        return null;
    }

    public String deleteRol(Integer id) {
        rolRepository.deleteById(id);
        return "Rol con ID " + id + " eliminado correctamente.";
    }
}
