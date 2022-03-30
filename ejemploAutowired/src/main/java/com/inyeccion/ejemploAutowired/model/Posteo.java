package com.inyeccion.ejemploAutowired.model;

//lombok nos permite resumir los getters y setters

import lombok.Getter;
import lombok.Setter;

//mediante annotations
@Getter @Setter
public class Posteo {
    
    private Long id;
    private String titulo;
    private String autor;
    
    
    //Creamos un constructor para crear desde repository un par de objetos 
    //para simular una lista traida desde, por ejemplo, una base de datos
    public Posteo(Long id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    } 
}
