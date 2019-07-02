package com.example.demo.controller;

import com.example.demo.MyConfig.Myproperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @Autowired
    Myproperties myproperties;

    @RequestMapping("/world")
    public String mycontroller(){
        return myproperties.toString();
    }
}
