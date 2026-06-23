package tmg.ohiggins.api.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cursos")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCurso;

    @NotBlank(message = "El codigo del curso es obligatorio")
    @Size(max = 20, message= "El codigo no puede superar los 20 caracteres")
    @Column(unique = true, nullable = false, length = 20)
    private String codigoCurso;

    @NotBlank(message = "El nombre del curso es obligatorio")
    @Size(max = 100, message = "El nombre del curso no puede superar los 100 caracteres")
    @Column(unique = true, nullable = false, length = 100)
    private String nombreCurso;

    @Size(max = 500, message= "La descripcion no puede superar los 500 caracteres")
    @Column(length  = 500)
    private String descripcion;

    //relacion con secciones
    @OneToMany(mappedBy = "curso", cascade = cascadeType.ALL, orphanRemoval = true)
    @ToString
}
