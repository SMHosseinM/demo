package com.example.demo.Guest.controller;


import com.example.demo.Guest.model.Guest;
import com.example.demo.Guest.service.GuestService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/guest")
@RequiredArgsConstructor
public class GuestController {

    private final GuestService guestService;

    @GetMapping(value = "/list")
    public List<Guest> getGuests() {
        return guestService.findAllGuests();
    }
}
