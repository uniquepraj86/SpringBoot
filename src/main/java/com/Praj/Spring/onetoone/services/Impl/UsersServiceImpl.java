package com.Praj.Spring.onetoone.services.Impl;

import com.Praj.Spring.onetoone.entity.Users;
import com.Praj.Spring.onetoone.repository.UsersRepository;
import com.Praj.Spring.onetoone.services.UsersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

import static com.Praj.Spring.Util.Constants.MESSAGE;

@Service
@Slf4j
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepository usersRepository;
    @Override
    public Map<String, Object> saveUsers(Users users) {
        Map<String,Object>  map = new HashMap<>();
       usersRepository.save(users);
       map.put(MESSAGE,"Users save Successfully");
        return map;
    }
}
