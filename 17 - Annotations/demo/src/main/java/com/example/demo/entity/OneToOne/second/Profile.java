package com.example.demo.entity.OneToOne.second;

import jakarta.persistence.*;

@Entity
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstname;
    private String lastname;
    private String avatarUrl;

    @OneToOne(mappedBy = "profile")
    private Person person;
}
