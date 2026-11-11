package com.example.NutreApp.models

import com.example.NutreApp.models.helpers.categoria;

public class Video {

    private UUID id;
    private String titulo;
    private String descripcion;
    private String url;
    private categoria sst;
    private categoria talento;
    private categoria capacitacion_interna;
    public Video() {
    }
    public Video(UUID id, String titulo, String descripcion, String url, categoria sst, categoria talento,
            categoria capacitacion_interna) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.url = url;
        this.sst = sst;
        this.talento = talento;
        this.capacitacion_interna = capacitacion_interna;
    }
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public categoria getSst() {
        return sst;
    }
    public void setSst(categoria sst) {
        this.sst = sst;
    }
    public categoria getTalento() {
        return talento;
    }
    public void setTalento(categoria talento) {
        this.talento = talento;
    }
    public categoria getCapacitacion_interna() {
        return capacitacion_interna;
    }
    public void setCapacitacion_interna(categoria capacitacion_interna) {
        this.capacitacion_interna = capacitacion_interna;
    }

    

}