package com.example.NutreApp.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.NutreApp.models.Usuario;

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

}
