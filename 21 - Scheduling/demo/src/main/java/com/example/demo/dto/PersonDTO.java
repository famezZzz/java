package com.example.demo.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class PersonDTO {
    private Long id;

    @NotBlank(message = "Title cannot be empty")
    private String title;

    @NotNull(message = "Year cannot be null")
    @Min(value = 1900,message = "Year must be >=1900")
    private int year;


    public PersonDTO() {
    }

    public PersonDTO(Long id, String title, int year) {
        this.id = id;
        this.title = title;
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}



//
//public class PersonDTO {
//    private Long key;
//    private String name;
//    private int age;
//
//    public PersonDTO() {
//    }
//
//
//    public PersonDTO(Long key, String name, int age) {
//        this.key = key;
//        this.name = name;
//        this.age = age;
//    }
//
//    public Long getKey() {
//        return key;
//    }
//
//    public void setKey(Long key) {
//        this.key = key;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//}
