package com.example.NutreApp.models;

import com.example.NutreApp.models.helpers.categoria;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.OneToMany;

@Entity
@Table(name = "videos")
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "titulo", nullable = false, unique = false, length = 100)
    private String titulo;

    @Column(name = "descripcion", nullable = true, unique = false, length = 255)
    private String descripcion;

    @Column(name = "url", nullable = false, unique = true, length = 255)
    private String url;

    @Column(name = "sst", nullable = true, unique = false)
    private categoria sst;

    @Column(name = "talento", nullable = true, unique = false)
    private categoria talento;

    @Column(name = "capacitacion_interna", nullable = true, unique = false)
    private categoria capacitacion_interna;



    @OneToMany (mappedBy = "video")
    @JsonManagedReference (value = "video-visualizacion")
    private List<video> visualizaciones;



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