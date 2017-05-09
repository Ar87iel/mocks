package com.example.dto;

/**
 * Created by DHbol on 5/9/2017.
 */
public class TabObjectDTO {
    private Integer id;
    private String nombre;
    private String description;

    public TabObjectDTO(Integer id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
