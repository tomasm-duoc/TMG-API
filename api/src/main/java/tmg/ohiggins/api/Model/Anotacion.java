package tmg.ohiggins.api.Model;


import java.sql.Date;
import java.time.LocalTime;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.NonNull;
@Table(name = "anotaciones")

public class Anotacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAnotacion;

    @NotNull(message = "El curso es obligatorio")
    private Integer idCurso;

    @NotBlank
    private String Tipo_de_registro;

    @NonNull
    private Date fecha;

    @NonNull
    private LocalTime hora;

    @NotBlank
    private String descripcion;

    
}
