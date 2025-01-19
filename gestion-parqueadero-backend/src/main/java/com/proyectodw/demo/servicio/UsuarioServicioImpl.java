package com.proyectodw.demo.servicio;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectodw.demo.entidad.Usuario;
import com.proyectodw.demo.entidad.UsuarioRol;
import com.proyectodw.demo.repositorio.RolRepository;
import com.proyectodw.demo.repositorio.UsuarioRepository;

@Service
public class UsuarioServicioImpl implements UsuarioServicio{

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private RolRepository rolRepository;

    @Override
    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception {
        Usuario usuarioLocal = usuarioRepository.findByUsername(usuario.getUsername());
        if(usuarioLocal != null){
            System.out.println("El usuario ya existe");
            throw new Exception("El usuario ya esta presente");
        }
        else{
            for(UsuarioRol usuarioRol:usuarioRoles){
                rolRepository.save(usuarioRol.getRol());
            }
            usuario.getUsusarioRoles().addAll(usuarioRoles);
            usuarioLocal = usuarioRepository.save(usuario);
        }
        return usuarioLocal;
    }

    @Override
    public Usuario obtenerUsuario(String username) {
        return usuarioRepository.findByUsername(username);
    }

    @Override
    public void eliminarUsuario(Long usuarioId) {
        usuarioRepository.deleteById(usuarioId);
    }
    
}
