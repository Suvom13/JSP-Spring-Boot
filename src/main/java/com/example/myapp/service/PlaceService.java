package com.example.myapp.service;

import com.example.myapp.model.Place;
import com.example.myapp.repository.Placerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class PlaceService {

    @Autowired
    private Placerepository placerepository;

    public void savePlace(Place place){
        placerepository.save(place);
    }

    public List<Place> showAllPlace(){
        List<Place> places = new ArrayList<Place>();
        for(Place place: placerepository.findAll()){
            places.add(place);
        }
        return places;
    }

    public void deletePlace(int id){
        placerepository.deleteById(id);
    }

    public Place editPlace(int id){
        return placerepository.findById(id).get();
    }

    public void saveUpdate(Place place){
        placerepository.save(place);
    }

    public boolean check(String name, String pass){
        return false;
    }
}
