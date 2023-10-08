package com.springboot.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
   @GetMapping
   public String defaultMethod(){
       return "Welcome to First Spring boot Application";
   }
}
