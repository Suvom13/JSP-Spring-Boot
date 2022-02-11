package com.example.myapp.controller;

import com.example.myapp.model.Place;
import com.example.myapp.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private PlaceService placeService;

    @GetMapping("/")
    public String hello(){
        return "This is home page";
    }

//    @GetMapping("/saveplace")
//    public String savePlace(@RequestParam String name, @RequestParam String country, @RequestParam int rating, @RequestParam String type){
//        Place place = new Place(name, country, rating, type);
//        placeService.savePlace(place);
//        System.out.println("DDD");
//        return "Place Saved";
//    }
}
