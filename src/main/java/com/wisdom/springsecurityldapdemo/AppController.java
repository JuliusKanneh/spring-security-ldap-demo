package com.wisdom.springsecurityldapdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping(value = "/home")
    public String home(){
        return ("<h1>Welcome Home ADAP Authentication</h1>");
    }
}
