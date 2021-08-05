package com.example.apipersonas;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
/**
 *
 * @author DICKDELV
 */
public interface PersonaRepositorio extends Repository<Persona, Integer>{
    
    @Query(value="select u.id_usuario, u.activo, u.id_rol, u.nombre ,u.nombre, r.nombre as nombrerol"+" from usuario u inner join rol r on u.id_rol=r.id_rol", nativeQuery = true)
    public List <Persona> dtall();
    
    List<Persona>findAll();
    Persona findById (int id_usuario);
    Persona save(Persona p);
    void delete(Persona p);
    
}
