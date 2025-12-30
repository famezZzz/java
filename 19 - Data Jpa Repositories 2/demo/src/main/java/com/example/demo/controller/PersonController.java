package com.example.demo.controller;

import com.example.demo.dto.PersonDTO;
import com.example.demo.services.PersonService;
import com.example.demo.services.impl.PersonServiceImpl;
import com.github.javafaker.Faker;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/person")
public class PersonController {

    @Autowired
    private PersonServiceImpl personServiceImpl;
    @Autowired
    private Faker fakerData;


    @PostMapping
    public ResponseEntity<PersonDTO> createPerson(@Valid @RequestBody PersonDTO personDTO) {
        return new ResponseEntity<>(personServiceImpl.create(personDTO), HttpStatus.CREATED);
    }

    @PostMapping("/batch")
    public ResponseEntity<List<PersonDTO>> createMulti(@Valid @RequestBody List<PersonDTO> personDTO) {
        return new ResponseEntity<>(personServiceImpl.createMultiple(personDTO), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<PersonDTO>> getAll() {
        return new ResponseEntity<>(personServiceImpl.getAll(), HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<PersonDTO> getAllById(@PathVariable Long id) {
        return new ResponseEntity<>(personServiceImpl.getById(id), HttpStatus.OK);
    }








//    private void generationData(int count) {
//        if (personOldRepository.count() == 0) {
//            for (int i = 0; i < count; i++) {
//                Person person = new Person();
//
//                String title = fakerData.book().title();
//                int year = fakerData.number().numberBetween(1950, 2024);
//                person.setYear(year);
//                person.setTitle(title);
//
//                personOldRepository.save(person);
//            }
//        }
//    }

//    @GetMapping("/all")
//    public ResponseEntity<?> getAll(Integer year) {
//        generationData(100);
//        return ResponseEntity.ok(personOldRepository.delete(year));
//    }



}
