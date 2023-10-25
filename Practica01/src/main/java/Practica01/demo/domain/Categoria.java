
package Practica01.demo.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;
@Data
@Entity
@Table(name="id_arbol")

public class Categoria implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_arbol")
    private Long idCategoria;
    private String nombre;
    private int cantidad;
    private int precio;
    private String imagen;
    
    
    public Categoria() {
    }

    public Categoria(String nombre, int cantidad, int precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
 
    
}
