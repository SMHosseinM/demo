package com.example.demo.Guest.repository;

import com.example.demo.Guest.model.Guest;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends CrudRepository<Guest, UUID> {
}
