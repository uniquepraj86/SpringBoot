package com.Praj.Spring.jpa.relationship.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Capital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String capitalName;
    @OneToOne
    @JoinColumn(name = "country_id")
    private Country country;

}
