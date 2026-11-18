package com.example.NutreApp.services;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.NutreApp.models.Usuario;

public class UsuarioServicio {
   
    //metodo para buscar todos
    //metodo para modificar
    //metodo para eliminar
    //metodo para buscar por departamento y rol
    //metodo para por correo
    //metodo para buesar por rol
    //metodo para verificar por correo
    


 //metodo para guardar 
    @Autowired 
    private UsuarioRepositorio usuarioRepositorio;


    public Usuario guardar (Usuario datos);{
        return this.usuarioRepositorio.save(datos);
    }

 //metodo para buscar por id
    public Usuario buscarPorId (UUID id);{

        optional<Usuario> usuarioBuscado = this.repositorio.findById(id);
        if (usuarioBuscado.isPresent()){
            return usuarioBuscado.get();


        }else{
            return usuarioBuscado.get();
        }
        
    }
}
