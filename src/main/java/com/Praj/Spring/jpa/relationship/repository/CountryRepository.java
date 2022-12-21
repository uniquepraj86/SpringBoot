package com.Praj.Spring.jpa.relationship.repository;

import com.Praj.Spring.jpa.relationship.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CountryRepository extends  JpaRepository<Country,Long>{

    Country findByCountryName(String countryName);

    Country findByCountryCode(String countryCode);

    Boolean existsByCountryCode(String CountryCode);
    Boolean existsByCountryName(String CountryName);

    Country findByCountryCodeAndCountryName(String CountryCode,String CountryName);



    List<Country> findByCountryNameLike(String countryName);


}
