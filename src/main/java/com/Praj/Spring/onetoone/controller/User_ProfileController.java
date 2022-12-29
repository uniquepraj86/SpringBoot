package com.Praj.Spring.onetoone.controller;


import com.Praj.Spring.onetoone.entity.User_Profile;
import com.Praj.Spring.onetoone.services.User_ProfileService;
import com.Praj.Spring.onetoone.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/User_Profile")
public class User_ProfileController {

    @Autowired
    private User_ProfileService user_profileService;


    public Map<String,Object> saveUser_Profile(@RequestBody User_Profile user_profile){
        return user_profileService.saveUser_Profile(user_profile);
    }
}
