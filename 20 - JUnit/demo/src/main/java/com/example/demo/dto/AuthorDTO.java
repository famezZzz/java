package com.example.demo.dto;

import com.example.demo.entity.Author;

public class AuthorDTO {
    String name;
    String email;

    public AuthorDTO(String name, String email) {
        this.name = name;
        this.email = email;
    }


    public Author getAuthorEntitie(){
        return new Author(this.name,this.email);
    }

    public AuthorDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
