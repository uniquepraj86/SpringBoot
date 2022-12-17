package com.Praj.Spring.jpa.relationship.repository;

import com.Praj.Spring.jpa.relationship.entity.Capital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CapitalRepository extends JpaRepository <Capital,Long> {

}
