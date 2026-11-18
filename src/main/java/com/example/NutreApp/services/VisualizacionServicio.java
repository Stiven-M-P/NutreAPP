package com.example.NutreApp.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.NutreApp.models.Usuario;
import com.example.NutreApp.models.Visualizacion;

public class VisualizacionServicio {
    

    //metodo para guardar 

     @Autowired 
    private VisualizacionRepositorio visualizacionRepositorio;


    public Visualizacion guardar (Visualizacion datos);{
        return this.visualizacionRepositorio.save(datos);
    }

}
