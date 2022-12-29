package com.Praj.Spring.onetoone.repository;

import com.Praj.Spring.onetoone.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {

    //void save(Users users) {}
}
