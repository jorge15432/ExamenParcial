
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
@Table(name="lugarconcierto")
public class lugarconcierto implements Serializable {



private static final long serialVersionUID=1L;

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)

private Long id;
    private String nombrelugar;

private String pais;
private int artistas_id;

private lugarconcierto Lugarconcierto;

    public lugarconcierto(Long id, String nombrelugar, String pais, int artistas_id, lugarconcierto Lugarconcierto) {
        this.id = id;
        this.nombrelugar = nombrelugar;
        this.pais = pais;
        this.artistas_id = artistas_id;
        this.Lugarconcierto = Lugarconcierto;
    }


   
    public lugarconcierto() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }


public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

 
  

  

    public String getNombrelugar() {
        return nombrelugar;
    }

    public void setNombrelugar(String nombrelugar) {
        this.nombrelugar= nombrelugar;
    }

   

   

  

  

   



}



