package tmg.ohiggins.api.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuarios_info")
public class UsuarioInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuario;

    @NotBlank
    private String nombre;

    @NotBlank
    private String apPaterno;
    
    @NotBlank
    private String apMaterno;

    @NotBlank
    private String rut;
    
    @NotBlank
    private Integer edad;
}
