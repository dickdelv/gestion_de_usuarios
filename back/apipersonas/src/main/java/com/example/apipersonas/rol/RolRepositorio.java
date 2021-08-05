package com.example.apipersonas.rol;
import com.example.apipersonas.*;
import java.util.List;
import org.springframework.data.repository.Repository;
/**
 *
 * @author DICKDELV
 */
public interface RolRepositorio extends Repository<Rol, Integer>{
    
    List<Rol>findAll();
    Rol findById (int id_rol);
    Rol save(Rol r);
    void delete(Rol r);
    
}
