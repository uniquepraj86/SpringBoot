package com.Praj.Spring.onetoone.services.Impl;

import com.Praj.Spring.onetoone.entity.User_Profile;
import com.Praj.Spring.onetoone.repository.User_ProfileRepository;
import com.Praj.Spring.onetoone.services.User_ProfileService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

import static com.Praj.Spring.Util.Constants.MESSAGE;
import static com.Praj.Spring.Util.Constants.STATUS;

@Service
@Slf4j
public class User_ProfileServiceImpl implements User_ProfileService {


    @Autowired
    private User_ProfileRepository user_profileRepository;

    @Override
    public Map<String, Object> saveUser_Profile(User_Profile user_profile) {
        Map<String,Object>  map = new HashMap<>();
        user_profileRepository.save(user_profile);
        map.put(MESSAGE,"User_Profile save Successfully");
        return map;
    }
}
