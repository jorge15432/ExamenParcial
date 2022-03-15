
package com.example.examen.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="artistas")
public class Artista implements Serializable{

private static final long serialVersionUID=1L;

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)

private Long id;
    private String nombre;
private String apellido1;
private String apellido2;
private String pais;

private lugarconcierto Lugarconcierto;


    public Artista(String nombre, String apellido1, String apellido2, String pais) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.pais = pais;
    }

    public Artista() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }


public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

   

   

  

  

   



}

