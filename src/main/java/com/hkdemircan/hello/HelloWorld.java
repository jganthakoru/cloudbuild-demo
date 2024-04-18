package com.hkdemircan.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


public class HelloWorld {

    
    public String getMessage(){
        return "Hello World with Docker";
    }
}
