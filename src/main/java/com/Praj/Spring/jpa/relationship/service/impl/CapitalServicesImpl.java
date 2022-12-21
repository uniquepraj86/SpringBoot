package com.Praj.Spring.jpa.relationship.service.impl;

import com.Praj.Spring.jpa.relationship.entity.Capital;
import com.Praj.Spring.jpa.relationship.repository.CapitalRepository;
import com.Praj.Spring.jpa.relationship.service.CapitalServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

import static com.Praj.Spring.Util.Constants.MESSAGE;
import static com.Praj.Spring.Util.Constants.STATUS;


@Service
@Slf4j
public class CapitalServicesImpl implements CapitalServices {

    @Autowired
    private CapitalRepository capitalRepository;


    @Override
    public Map<String,Object >saveCapital(Capital capital) {

        Map<String,Object>map = new HashMap<>();
        map.put(MESSAGE,"Capital Save Successfully");
        map.put(STATUS, HttpStatus.CREATED.value());
        return map;
    }





}
