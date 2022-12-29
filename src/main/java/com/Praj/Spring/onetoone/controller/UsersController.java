package com.Praj.Spring.onetoone.controller;

import com.Praj.Spring.onetoone.entity.Users;
import com.Praj.Spring.onetoone.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/Users")
public class UsersController {
    @Autowired
    private UsersService usersService;
    @PostMapping
   public Map<String,Object> saveUsers(@RequestBody Users users){

       return usersService.saveUsers(users);

   }


}
