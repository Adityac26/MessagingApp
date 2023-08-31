package com.example.firstspring.controller;

import com.example.firstspring.model.User;
import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/hello")
public class RestController {


    @RequestMapping(value = "/hey", method = RequestMethod.GET)
    public String hello(){
        return "Hello from Bridgelabz";
    }

    @RequestMapping(value = "/query",method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name){
        return "Hello "+name;
    }

    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name){

        return "Hello "+name + "!";
    }

    @PostMapping("/post")
    public String sayHello(@RequestBody User user){
        return "Hello "+ user.getFirstname()+ " "+user.getLastname()+"!";

    }

    @PutMapping("/put/{firstname}")
    public String sayHello(@PathVariable String firstname,
                           @RequestParam(value = "lastname")String lastname){
        return "Hello "+firstname + " " +lastname +"!";
    }



}
