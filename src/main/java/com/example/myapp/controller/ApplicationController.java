package com.example.myapp.controller;

import com.example.myapp.model.Place;
import com.example.myapp.model.User;
import com.example.myapp.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class ApplicationController {

    @Autowired
    private PlaceService placeService;

    @RequestMapping("/welcome")
    public String Welcome(){
        return "loginPage";
    }

    @PostMapping ("/save-place")
    public String addingPlace(@ModelAttribute Place place, HttpServletRequest request){
        placeService.savePlace(place);
        request.setAttribute("places", placeService.showAllPlace());
        return "showPage";
    }

    @PostMapping("/backToAdd")
    public String backToAddPage(){
        return "welcomePage";
    }

    @PostMapping("/show-place")
    public String showingPlace(HttpServletRequest request){//only verb
        request.setAttribute("places", placeService.showAllPlace());
        return "showPage";
    }

    @RequestMapping("/delete-place")
    public String deletePlace(@RequestParam int id, HttpServletRequest request){
        placeService.deletePlace(id);
        request.setAttribute("places", placeService.showAllPlace());
        return "showPage";
    }

    @RequestMapping("/update-place")
    public String updatePlace(@RequestParam int id, HttpServletRequest request){
        request.setAttribute("place", placeService.editPlace(id));
        return "editPage";
    }

    @PostMapping("/edit-place")
    public String settingValue(@RequestParam int id, @ModelAttribute Place place, BindingResult bindingResult, HttpServletRequest request){
        place.setId(id);
        placeService.saveUpdate(place);
        request.setAttribute("places", placeService.showAllPlace());
        return "showPage";
    }

    @PostMapping("/user-login")
    public String userLoginPage(@ModelAttribute User user){
        System.out.println("ddd");
        System.out.println(user.getUserName());
        System.out.println(user.getPassword());
//        if(placeService.check(user.getUserName(), user.getPassword()))
//            return "welcomePage";
//        else return "loginPage";
        if(user.getUserName() == "som13" && user.getPassword() == "123")
            return "welcomePage";
        else return "WRONG password";
    }

    @ResponseBody
    @GetMapping("/userhome")
    public String uhome(){
        return "This is User Home";
    }

    @ResponseBody
    @GetMapping("/adminhome")
    public String ahome(){
        return "This is User Home";
    }
}
