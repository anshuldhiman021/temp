package com.anshul.praticelast.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class HealthController {
    @Autowired
  private  Laptop laptop;
//    @RequestMapping("/check")
//    public String greet(){
//        return "Everything is okay";
//    }
    public void build(){
        laptop.compile();
        System.out.println("project is working ");
    }

}
