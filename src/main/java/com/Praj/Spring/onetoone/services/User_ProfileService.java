package com.Praj.Spring.onetoone.services;

import com.Praj.Spring.onetoone.entity.User_Profile;
import com.Praj.Spring.onetoone.entity.Users;

import java.util.Map;

public interface User_ProfileService {
    Map<String,Object> saveUser_Profile(User_Profile user_profile);

}
