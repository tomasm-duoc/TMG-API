package tmg.ohiggins.api.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tmg.ohiggins.api.Model.Usuario;
import tmg.ohiggins.api.Repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    public Usuario getUsuarioById(Integer id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public Usuario saveUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario updateUsuario(Integer id, Usuario usuario) {
        Usuario existingUsuario = usuarioRepository.findById(id).orElse(null);
        if (existingUsuario != null) {
            existingUsuario.setNombre(usuario.getNombre());
            existingUsuario.setApPaterno(usuario.getApPaterno());
            existingUsuario.setApMaterno(usuario.getApMaterno());
            existingUsuario.setRut(usuario.getRut());
            existingUsuario.setEdad(usuario.getEdad());
            existingUsuario.setRol(usuario.getRol());
            return usuarioRepository.save(existingUsuario);
        }
        return null;
    }

    public String deleteUsuario(Integer id) {
        usuarioRepository.deleteById(id);
        return "Usuario con ID " + id + " eliminado correctamente.";
    }
}
