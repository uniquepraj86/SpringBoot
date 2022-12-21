package com.Praj.Spring.jpa.relationship.service.impl;

import com.Praj.Spring.jpa.relationship.entity.Country;
import com.Praj.Spring.jpa.relationship.repository.CountryRepository;
import com.Praj.Spring.jpa.relationship.service.CountryServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static com.Praj.Spring.Util.Constants.MESSAGE;
import static com.Praj.Spring.Util.Constants.STATUS;

@Service
@Slf4j
public class CountryServicesImpl implements CountryServices{

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public Map<String, Object> saveCountry(Country country) {
        Map<String,Object> map = new HashMap<>();
        if(countryRepository.existsByCountryCode(country.getCountryCode())){
            map.put(MESSAGE,"Duplicate Country Code");
            map.put(STATUS, HttpStatus.INTERNAL_SERVER_ERROR.value());
        }
        else if(countryRepository.existsByCountryName(country.getCountryName())){
            map.put(MESSAGE,"Duplicate Country Name");
            map.put(STATUS, HttpStatus.INTERNAL_SERVER_ERROR.value());
        }
        else {
            countryRepository.save(country);
            map.put(MESSAGE,"Country Save Successfully");
            map.put(STATUS, HttpStatus.CREATED.value());

        }
       return map;
    }

    @Override
    public List<Country> findAll() {
        return countryRepository.findAll();
    }

    @Override
    public Country getByCountryCodeAndCountryName(String CountryCode, String CountryName) {
        return countryRepository.findByCountryCodeAndCountryName(CountryCode,CountryName);
    }


    @Override
    public Country findByCountryName(String country) {
        return countryRepository.findByCountryName(country);
    }

    @Override
    public Country getByCountryCode(String countryCode) {
        return countryRepository.findByCountryCode(countryCode);
    }

    @Override
    public Map<String, Object> updateCountry(Long id, String countryName) {
        Map<String,Object> map = new HashMap<>();
        Optional<Country> countryOptional = countryRepository.findById(id);
        if (countryOptional.isPresent()){
            Country country = countryOptional.get();
            country.setCountryName(countryName);
            countryRepository.save(country);
            map.put(MESSAGE,"Country updated successfully");
            map.put(STATUS,HttpStatus.OK.value());
        }else {
            map.put(MESSAGE,"NOT FOUNT");
            map.put(STATUS,HttpStatus.NOT_FOUND.value());
        }

        return map;
    }

}
