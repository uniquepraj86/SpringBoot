package com.Praj.Spring.jpa.relationship.controller;

import com.Praj.Spring.jpa.relationship.entity.Country;
import com.Praj.Spring.jpa.relationship.service.CountryServices;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/country")
public class CountryController {
    @Autowired
    private CountryServices countryServices;

    @PostMapping
    public String saveCountry(@RequestBody Country country){
        return countryServices.saveCountry(country);

    }

    public List<Country>findAll(){
        return countryServices.findAll();
    }
    }

