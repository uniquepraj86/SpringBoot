package com.Praj.Spring.onetoone.services;

import com.Praj.Spring.onetoone.entity.Users;

import java.util.Map;

public interface UsersService {
    Map<String,Object> saveUsers(Users users);
}
