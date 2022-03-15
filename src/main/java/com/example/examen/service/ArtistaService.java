
package com.example.examen.service;

import com.example.examen.entity.Artista;
import java.util.List;


public interface ArtistaService {
public List<Artista> getArtista();

public void save(Artista artista);

public void delete(Artista artista);

public Artista getArtista(Artista artista);

    public void delete(Long id);
}
