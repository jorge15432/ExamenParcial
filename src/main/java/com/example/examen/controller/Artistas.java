
package com.example.examen.controller;

import com.example.examen.entity.Artista;
import com.example.examen.repositories.ArtistaRepository;
import com.example.examen.service.ArtistaService;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.experimental.var;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller


public class Artistas {

@Autowired
 private ArtistaService artistaService;

 @GetMapping("/artistas")
    public String index(Model model) {

        List<Artista> Artistas = artistaService.getArtista();
        model.addAttribute("titulo", "Personas");
        model.addAttribute("artistas", Artistas);
        return "artista";

    }

@GetMapping("/artistas")
public String crearArtista(Model model){
model.addAttribute("artistas",new Artista());
return "crear";
}

@PostMapping("/save")
public String guardarPersona(Artista artista){
artistaService.save(artista);
return "redirect:/artistas";
}
@GetMapping("delete/{id}")
public String eliminarArtista (@PathVariable("id")Long id)
{
artistaService.delete(id);
return "redirect:/personas";
}
    @GetMapping("/nuevoCliente")
    public String nuevoArtista(Artista artista) {
        return "crear";
    }

  

}


