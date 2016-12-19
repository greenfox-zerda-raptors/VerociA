package com.greenfoxacademy.springstart.controllers;

import lombok.Getter;

/**
 * Created by Verőci Ádám on 2016.12.19..
 */

public class Greeting{
    @Getter
    long id;
    @Getter
    String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }
}
