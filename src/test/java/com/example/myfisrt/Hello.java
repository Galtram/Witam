package com.example.myfisrt;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController

public class Hello {




    @GetMapping(path= "/api/hello")
    public String hello()
    {
        return "Hello world from the server";
    }
}
