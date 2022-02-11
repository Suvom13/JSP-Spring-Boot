package com.example.myapp.repository;

import com.example.myapp.model.Place;
import com.example.myapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Placerepository extends JpaRepository<Place, Integer> {

    User findByUsername(String username);
}
