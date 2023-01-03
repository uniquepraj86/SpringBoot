package com.Praj.Spring.onetomany.repository;

import com.Praj.Spring.onetomany.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {

}

