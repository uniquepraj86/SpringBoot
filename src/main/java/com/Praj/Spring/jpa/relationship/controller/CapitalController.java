package com.Praj.Spring.jpa.relationship.controller;


import com.Praj.Spring.jpa.relationship.entity.Capital;
import com.Praj.Spring.jpa.relationship.entity.Country;
import com.Praj.Spring.jpa.relationship.service.CapitalServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/capital")
public class CapitalController {

    @Autowired
    private CapitalServices capitalServices;

    @PostMapping
    public Map<String,Object> saveCapital(@RequestBody Capital capital){
        return capitalServices.saveCapital(capital);
    }



}
