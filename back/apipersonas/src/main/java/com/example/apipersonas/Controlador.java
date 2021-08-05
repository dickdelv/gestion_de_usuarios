package com.example.apipersonas;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author DICKDELV
 */

@RestController
@RequestMapping({"/api"})
@CrossOrigin(origins = "http://localhost:4200")

public class Controlador {
    
    @Autowired
    PersonaService service;
    
    @GetMapping("/lista")
    public List<Persona>listar(){
    return service.listar();
}
    @PostMapping("/create")
        public Persona agregar(@RequestBody Persona p){
        return service.add(p);
    }
    

}
