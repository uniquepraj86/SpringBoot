package com.Praj.Spring.jpa.relationship.service;

import com.Praj.Spring.jpa.relationship.entity.Country;

import java.util.List;
import java.util.Map;

public interface CountryServices {
    Map<String, Object> saveCountry(Country country);
    List<Country> findAll();
    Country findByCountryName(String country);


    Country getByCountryCode(String countryCode);

    Country getByCountryCodeAndCountryName(String CountryCode,String CountryName);


    Map<String,Object> updateCountry(Long id, String countryName);



}
