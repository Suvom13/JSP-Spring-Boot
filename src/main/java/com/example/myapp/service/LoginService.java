package com.example.myapp.service;

import com.example.myapp.model.User;
import com.example.myapp.repository.Placerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class LoginService implements UserDetailsService {

    @Autowired
    private Placerepository placerepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = placerepository.findByUsername(username);
        if(user == null){
            throw new UsernameNotFoundException("User is not found");
        }
        return new CustomUserDetails(user);
    }
}
