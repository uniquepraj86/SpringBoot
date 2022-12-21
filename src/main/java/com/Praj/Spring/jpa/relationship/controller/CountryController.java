package com.Praj.Spring.jpa.relationship.controller;

import com.Praj.Spring.jpa.relationship.entity.Country;
import com.Praj.Spring.jpa.relationship.service.CountryServices;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/country")
public class CountryController {
    @Autowired
    private CountryServices countryServices;


    @PostMapping
    public Map<String,Object> saveCountry(@RequestBody Country country){
        return countryServices.saveCountry(country);
    }

   @GetMapping
    public List<Country>findAll(){
        return countryServices.findAll();
    }

    @GetMapping("/findByCountryName/{Country}")
    public Country findByCountryName(@PathVariable String Country){
        return countryServices.findByCountryName(Country);
    }

    @GetMapping("/findByCountryCode/{countryCode}")
    public Country findByCountryCode(@PathVariable String countryCode){
        return countryServices.getByCountryCode(countryCode);
    }

    @GetMapping("/findByCountryCodeAndName/{countryCode}/{countryName}")
    public Country findByCountryCodeAndName(@PathVariable String countryCode,
                                            @PathVariable String countryName){
        return countryServices.getByCountryCodeAndCountryName(countryCode,countryName);
    }
    @PutMapping("/updateCountry/{id}")
    public Map<String,Object> updateCountry(@PathVariable Long id,
                                            @RequestParam String countryName){
        return  countryServices.updateCountry(id,countryName);
    }
}

