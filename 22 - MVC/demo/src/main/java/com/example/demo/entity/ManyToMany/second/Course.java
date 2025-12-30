package com.example.demo.entity.ManyToMany.second;


import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String courseName;

    @OneToMany(mappedBy = "course")
    private Set<StudentCourse> studentCourses = new HashSet<>();
}
