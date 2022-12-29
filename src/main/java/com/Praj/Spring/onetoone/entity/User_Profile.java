package com.Praj.Spring.onetoone.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class User_Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String address1;

    private String address2;

    private String city;

    private String country;

    private Date date;

    private String gender;

    private  String phone_Number;

    private String state;

    private String street;

    private String zip_code;

    @OneToOne
    @JoinColumn(name = "users_id")
    private Users users;



}
