package com.example.demo.Guest.service;

import com.example.demo.Guest.model.Guest;
import com.example.demo.Guest.repository.GuestRepository;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GuestService {

    private final GuestRepository guestRepository;
    public List<Guest> findAllGuests() {
        Iterable<Guest> iterable = guestRepository.findAll();
        return Lists.newArrayList(iterable);
    }

}
