package com.example.apipersonas.rol;

import com.example.apipersonas.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author DICKDELV
 */
@Service
public class RolServiceImp implements  RolService{
    @Autowired
    private RolRepositorio repositorio;

    @Override
    public List<Rol> listar() {
        return repositorio.findAll();
    }

    @Override
    public Rol listarId(int id_rol) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Rol add(Rol r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Rol edit(Rol r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Rol delete(int id_rol) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
