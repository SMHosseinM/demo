package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.demo.Guest.model.Guest;
import com.example.demo.Guest.repository.GuestRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.utils.BaseIntegrationTest;

public class TestClass extends BaseIntegrationTest {

    @Autowired
    protected GuestRepository guestRepository;

    @Test
    public void shouldReturnListOfAllGuests() {
        Guest guest = Guest.builder().build();

        guestRepository.save(guest);

    }
}
