package com.example.NutreApp.services;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import com.example.NutreApp.models.Usuario;
import com.example.NutreApp.models.Visualizacion;

public class VisualizacionServicio {
    

    //metodo para guardar 

     @Autowired 
    private VisualizacionRepositorio visualizacionRepositorio;


    public Visualizacion guardar (Visualizacion datos);{
        return this.visualizacionRepositorio.save(datos);
    }

    //metodo para buscar por id
    public Visualizacion buscarPorId (UUID id);{

        optional<Visualizacion> visualizacionBuscado = this.visualizacionRepositorio.findById(id);
        if (visualizacionBuscado.isPresent()){
              throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "id no encontrado");


        }else{
            return visualizacionBuscado.get();
        }
        
    }

    //metodo para buscar todos

    PUBLIC List<Visualizacion> buscarTodos();{
        return this.visualizacionRepositorio.findAll();
    }

    //metodo para modificar

    public Visualizacion modificar (UUID id, Visualizacion datos){
          optional<Visualizacion> visualizacionBuscado = this.visualizacionRepositorio.findById(id);
        if (visualizacionBuscado.isPresent()){
              throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "id no encontrado");

        }else{

            //1. PRECARGAR LA INFO QUE EXISTE ACTUALMENTE EN BD 
            Visualizacion visualizacionEncontrada = visualizacionBuscado.get();

            //2. espacio para volvr a guardar la visualizacion que se acaba de modificar
            return this.visualizacionRepositorio.save(visualizacionEncontrada);
        
    }


    //metodo para eliminar

    public Boolean eliminar (UUID id){
          optional<Visualizacion> visualizacionBuscado = this.visualizacionRepositorio.findById(id);
        if (visualizacionBuscado.isPresent()){
              throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "id no encontrado");

        }else{

            //1. PRECARGAR LA INFO QUE EXISTE ACTUALMENTE EN BD 
            Visualizacion visualizacionEncontrada = visualizacionBuscado.get();
    
            //2. espacio para eliminar la visualizacion
            this.visualizacionRepositorio.delete(visualizacionEncontrada);

            return true;

}
