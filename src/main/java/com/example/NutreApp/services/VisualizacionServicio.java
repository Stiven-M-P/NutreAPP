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

}
