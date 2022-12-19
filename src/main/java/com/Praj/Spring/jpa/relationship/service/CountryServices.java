package com.Praj.Spring.jpa.relationship.service;

import com.Praj.Spring.jpa.relationship.entity.Country;

import java.util.List;

public interface CountryServices {
    String saveCountry(Country country);


    List<Country> findAll();
}
