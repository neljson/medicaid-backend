package com.medicaidhelp.backend.API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/demo")
public class Controller {
    private final ServiceLayer serviceLayer;

    // constructor
    // Autowired dependency injection, automatically instantiates new objects (new bean)
    @Autowired
    public Controller(ServiceLayer serviceLayer) {
        this.serviceLayer = serviceLayer;
    }
    @GetMapping
    public String sayHello() {
        return serviceLayer.sayHello();
    }
}
