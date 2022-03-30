
package com.inyeccion.ejemploAutowired.controller;

import com.inyeccion.ejemploAutowired.model.Posteo;
import com.inyeccion.ejemploAutowired.repository.PosteoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PosteoController {
    
    //El autowired inyecta la dependencia
    //sin necesidad de crear un nuevo objeto
    @Autowired
    PosteoRepository repository;
    
    @GetMapping ("/posteos")
    public List<Posteo> traerTodos(){
    
        return repository.traerTodos();
        
    }
}
