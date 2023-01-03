package com.Praj.Spring.onetoone.entity;

//import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
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
}
