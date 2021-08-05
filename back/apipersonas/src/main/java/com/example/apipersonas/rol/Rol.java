package com.example.apipersonas.rol;

/**
 *
 * @author DICKDELV
 */
import com.example.apipersonas.*;
import  javax.persistence.*;
@Entity
@Table (name="rol")

public class Rol {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id_rol; 
    @Column
    private String nombre;

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

 
    
    
}
