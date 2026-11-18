package com.example.NutreApp.services;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import com.example.NutreApp.models.Usuario;
import com.example.NutreApp.models.Video;

public class VideoServicio {
    

    //metodo para buscar por id
    //metodo para buscar todos
    //metodo para modificar
    //metodo para eliminar
    //metodo para buscar por categoria
    //metodo para buscar por titulo
    //metodo para buscar por descripcion
    //metodo para buscar por url
    //metodo para buscar por 


    //metodo para guardar 

     @Autowired 
    private VideoRepositorio videoRepositorio;


    public Video guardar (Video datos);{
        return this.videoRepositorio.save(datos);
    }

    //metodo para buscar por id
    public Video buscarPorId (UUID id);{

        optional<Video> videoBuscado = this.videoRepositorio.findById(id);
        if (videoBuscado.isPresent()){
              throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "id no encontrado");


        }else{
            return videoBuscado.get();
        }
        
    }

    //metodo para buscar todos

    PUBLIC List<Video> buscarTodos();{
        return this.videoRepositorio.findAll();
    }

    

}
