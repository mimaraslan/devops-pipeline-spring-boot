package com.mimaraslan.app;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MyRestController {


//    http://localhost:8082/api/v1/info
    @GetMapping("/info")
    public String getInfo(){
        return "Hello World";
    }
}
