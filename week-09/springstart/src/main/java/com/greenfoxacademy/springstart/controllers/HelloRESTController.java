package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Verőci Ádám on 2016.12.19..
 */
@RestController
public class HelloRESTController {

    static final AtomicLong counter = new AtomicLong();

    @RequestMapping(value="/greeting")
    @ResponseBody
    public Greeting greeting(@RequestParam String name){
    Greeting greet= new Greeting(counter.getAndIncrement(), "Hello " + name);
    return greet;
    }
}
