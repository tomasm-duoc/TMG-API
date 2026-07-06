package tmg.ohiggins.api.Model;


import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "anotaciones")
public class Anotacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAnotacion;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_rol", nullable = false)
    @NotNull(message = "El rol es obligatorio")
    private Rol rol;;

    @NotBlank(message = "El tipo de registro es obligatorio")
    private String tipoRegistro;

     @NotNull(message = "La fecha es obligatoria")
    private LocalDate fecha;

     @NotNull(message = "La hora es obligatoria")
    private LocalTime hora;

    @NotBlank(message = "La descripcion es obligatoria")
    private String descripcion;

}
