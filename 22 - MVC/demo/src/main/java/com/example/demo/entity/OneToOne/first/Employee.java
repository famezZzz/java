package com.example.demo.entity.OneToOne.first;

import jakarta.persistence.*;

//@interface farid{
//    String name();
//}
//    @farid(name = "Farid")

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String name;

    @OneToOne
    @JoinColumn(
            name = "workstation_id",  // kolonka FK workstation_id
            referencedColumnName = "id",
            unique = true
    )
    private Workstation workstation;
}
