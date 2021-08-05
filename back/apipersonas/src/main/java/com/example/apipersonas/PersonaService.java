package com.example.apipersonas;

import java.util.List;

/**
 *
 * @author DICKDELV
 */
public interface PersonaService {
    public List<Persona>dtall();
    public List<Persona>listar();
    Persona listarId(int id_usuario);
    Persona add(Persona p);
    Persona edit(Persona p);
    Persona delete(int id_usuario);
        
    
}
