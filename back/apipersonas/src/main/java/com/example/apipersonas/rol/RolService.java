package com.example.apipersonas.rol;

import com.example.apipersonas.*;
import java.util.List;

/**
 *
 * @author DICKDELV
 */
public interface RolService {
    public List<Rol>listar();
    Rol listarId(int id_rol);
    Rol add(Rol r);
    Rol edit(Rol r);
    Rol delete(int id_rol);
        
    
}
