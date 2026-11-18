package com.example.NutreApp.services;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import com.example.NutreApp.models.Usuario;
import com.example.NutreApp.models.repositories.IUsuarioRepositorio;

public class UsuarioServicio {
   
    
    //metodo para buscar por departamento y rol
    //metodo para buscar por correo
    //metodo para buscar por rol
    //metodo para verificar por correo
    


 //metodo para guardar 
    @Autowired 
    private IUsuarioRepositorio usuarioRepositorio;


    public Usuario guardar (Usuario datos);{
        return this.usuarioRepositorio.save(datos);
    }

 //metodo para buscar por id
    public Usuario buscarPorId (UUID id);{

        optional<Usuario> usuarioBuscado = this.repositorio.findById(id);
        if (usuarioBuscado.isPresent()){
              throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "id no encontrado");


        }else{
            return usuarioBuscado.get();
        }
        
    }

    //metodo para buscar todos

    PUBLIC List<Usuario> buscarTodos();{
        return this.repositorio.findAll();
    }

    //metodo para modificar

    public Usuario modificar (UUID id, Usuario datos){
          optional<Usuario> usuarioBuscado = this.repositorio.findById(id);
        if (usuarioBuscado.isPresent()){
              throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "id no encontrado");

        }else{

            //1. PRECARGAR LA INFO QUE EXISTE ACTUALMENTE EN BD 
            Usuario usuarioEncontrado = usuarioBuscado.get();
    
            //2. espacio para modificar solo las propiedades permitidas
            usuarioEncontrado.setNombre(datos.getNombre());
            usuarioEncontrado.setRol(datos.getRol());

            //3. espacio para volvr a guardar el usuario que se acaba de modificar
            return this.repositorio.save(usuarioEncontrado);
        
    }

    //metodo para eliminar

    public Boolean eliminar (UUID id){
          optional<Usuario> usuarioBuscado = this.repositorio.findById(id);
        if (usuarioBuscado.isPresent()){
              throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "id no encontrado");

        }else{

            //1. PRECARGAR LA INFO QUE EXISTE ACTUALMENTE EN BD 
            Usuario usuarioEncontrado = usuarioBuscado.get();
    
            //2. espacio para eliminar el usuario
            this.repositorio.delete(usuarioEncontrado);

            return true;
        
    }
}
