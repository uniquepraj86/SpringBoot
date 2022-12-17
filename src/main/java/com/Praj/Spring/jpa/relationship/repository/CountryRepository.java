package com.Praj.Spring.jpa.relationship.repository;

import com.Praj.Spring.jpa.relationship.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends  JpaRepository<Country,Long>{

}
