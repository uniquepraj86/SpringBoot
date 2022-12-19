package com.Praj.Spring.jpa.relationship.repository;

import com.Praj.Spring.jpa.relationship.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CountryRepository extends  JpaRepository<Country,Long>{


}
