package com.medicaidhelp.backend.API;
import org.springframework.stereotype.Service;

// @Service indicates the class as a bean
@Service
public class ServiceLayer {
    public String sayHello() {
        // implementation here should come from a database
        return "Hello World";
    }
}
