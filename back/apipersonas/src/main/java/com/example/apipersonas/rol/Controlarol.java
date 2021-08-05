package com.example.apipersonas.rol;


import com.example.apipersonas.*;
import com.example.apipersonas.rol.Rol;
import com.example.apipersonas.rol.RolService;
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

public class Controlarol {
    
    @Autowired
    RolService Service;  
    
    @GetMapping("/listarol")
     public List<Rol> listar(){
     return Service.listar();
}  

}
