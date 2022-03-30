package com.inyeccion.ejemploAutowired.repository;

import com.inyeccion.ejemploAutowired.model.Posteo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class PosteoRepository {
    
    //Creamos dos objetos para simular una lista que viniese, por ejemplo,
    //de una base de datos
    
    //Creo el método traerTodos que va a utilizar una lista
    public List<Posteo> traerTodos() {
        
        //Creo la lista en cuestión
        List<Posteo> listaPosteos = new ArrayList<Posteo>();
        
        listaPosteos.add(new Posteo (1L, "¿Cómo formatear una PC?", "Luisina de Paula"));
        listaPosteos.add(new Posteo (2L, "¿Cómo mantener la seguridad?", "Gabriel Guismín"));
        
        return listaPosteos;
        
    }
    
}
