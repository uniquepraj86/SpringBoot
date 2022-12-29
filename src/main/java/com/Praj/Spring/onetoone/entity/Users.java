package com.Praj.Spring.onetoone.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Users {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String email;

    private  String first_name;

    private String last_name;

    private String password;

//
//    @OneToOne
//    @JoinColumn(name = "user_profile_id")
//    private User_Profile user_profile;
}
