package com.example.demo.controller;

import com.example.demo.dto.AuthorDTO;
import com.example.demo.entity.Author;
import com.example.demo.entity.Person;
import com.example.demo.repository.AuthorRepository;
import com.example.demo.repository.PersonOldRepository;
import com.github.javafaker.Faker;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/author")
public class AuthorController {

    @Autowired
    private AuthorRepository authorRepository;

    @GetMapping("/all")
    public ResponseEntity<?> getAll() {
        List<Author> authors = authorRepository.findAll();
        if (!authors.isEmpty()) {
            return new ResponseEntity<>(authors, HttpStatus.OK);
        }
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/add")
    public ResponseEntity<Author> create(@RequestBody @Valid AuthorDTO authorDTO) {
        Author save = authorRepository.save(authorDTO.getAuthorEntitie());
        return new ResponseEntity<>(save, HttpStatus.CREATED);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Author> getById(@PathVariable(name = "id") Long id) {
        return authorRepository
                .findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }


    @PutMapping("/{id}")
    public ResponseEntity<Author> update(@PathVariable Long id, @RequestBody AuthorDTO authorDTO) {
        return authorRepository
                .findById(id)
                .map(exist -> {
                    exist.setName(authorDTO.getName());
                    exist.setEmail(authorDTO.getEmail());
                    Author author = authorRepository.save(exist);
                    return ResponseEntity.ok(author);
                })
                .orElse(ResponseEntity.notFound().build());
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletById(@PathVariable(name = "id") Long id) {
        return authorRepository
                .findById(id)
                .map(author -> {
                    authorRepository.delete(author);
                    return ResponseEntity.ok().<Void>build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
