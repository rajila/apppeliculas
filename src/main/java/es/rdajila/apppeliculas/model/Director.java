package es.rdajila.apppeliculas.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Director {
    private Integer id;
    private String nombre;
    private String apellido;
}
