package com.parmar.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class MovieBookingController {

    @GetMapping("/message")
    public String message(){
        return "movie booking is currently on pause !!";
    }
}
