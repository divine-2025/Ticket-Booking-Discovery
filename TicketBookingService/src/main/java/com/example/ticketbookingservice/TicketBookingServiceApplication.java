package com.example.ticketbookingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TicketBookingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TicketBookingServiceApplication.class, args);
    }

}
