package java.com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Ticket")
public class BookingController {
    @GetMapping("/Booking")
    public String BookingService(){
        return "BookingService";
    }
}
