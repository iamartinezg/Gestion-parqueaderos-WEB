package com.proyectodw.demo.servicio;

import java.util.Set;

import com.proyectodw.demo.entidad.Usuario;
import com.proyectodw.demo.entidad.UsuarioRol;

public interface UsuarioServicio {

    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;
    
    public Usuario obtenerUsuario(String username);

    public void eliminarUsuario(Long usuarioId);
}
