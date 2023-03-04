package com.workshop.abhisheksecurity.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/greet")
public class MyController {
     @GetMapping
    public ResponseEntity<String> greet(){
        return ResponseEntity.ok(" Welome !");
    }

    @GetMapping("/hello")
   public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Hello User !");
    }

    @GetMapping("/goodbye")
   public ResponseEntity<String> sayGoodBye(){
         return ResponseEntity.ok("GoodBye User");
    }

}
