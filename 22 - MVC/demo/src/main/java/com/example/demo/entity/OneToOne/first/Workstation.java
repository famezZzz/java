package com.example.demo.entity.OneToOne.first;

import jakarta.persistence.*;

@Entity
public class Workstation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String location;

    @OneToOne(mappedBy = "workstation")
    private Employee employee;

}
