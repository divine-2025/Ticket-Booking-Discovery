package com.example.ticketbookingservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ticket")
public class BookingController {
    @GetMapping("/booking")
    public String BookingService(){
        return "BookingService";
    }
}
