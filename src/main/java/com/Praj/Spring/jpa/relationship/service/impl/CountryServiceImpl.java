package com.Praj.Spring.jpa.relationship.service.impl;

import com.Praj.Spring.jpa.relationship.entity.Country;
import com.Praj.Spring.jpa.relationship.repository.CountryRepository;
import com.Praj.Spring.jpa.relationship.service.CountryServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CountryServiceImpl implements CountryServices{

    @Autowired
    private CountryRepository countryRepository;


    @Override
    public String saveCountry(Country country) {

        countryRepository.save(country);

        log.info("Country saved  successfully");

        return "Country Saved Successfully";
    }

    @Override
    public List<Country> findAll() {
        return countryRepository.findAll();
    }

//    @Override
//    public void findAll() {
//
//    }


}
