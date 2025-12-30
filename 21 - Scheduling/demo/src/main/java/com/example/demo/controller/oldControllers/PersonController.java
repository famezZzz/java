package com.example.demo.controller.oldControllers;

import com.example.demo.dto.PersonDTO;
import com.example.demo.services.PersonService;
import com.github.javafaker.Faker;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/person")
public class PersonController {


    @Qualifier("personServiceDBImpl")
    @Autowired
    private PersonService personService;

    @Autowired
    private Faker fakerData;


    @PostMapping
    public ResponseEntity<PersonDTO> createPerson(@Valid @RequestBody PersonDTO personDTO) {
        return new ResponseEntity<>(personService.create(personDTO), HttpStatus.CREATED);
    }

    @PostMapping("/batch")
    public ResponseEntity<List<PersonDTO>> createMulti(@Valid @RequestBody List<PersonDTO> personDTO) {
        return new ResponseEntity<>(personService.createMultiple(personDTO), HttpStatus.CREATED);
    }

    @GetMapping("/z")
    public ResponseEntity<PersonDTO> z(@Valid @RequestBody PersonDTO personDTO) {
        return personService.test(personDTO);
    }


    @GetMapping("/{id}")
    public ResponseEntity<PersonDTO> getAllById(@PathVariable Long id) {
        return new ResponseEntity<>(personService.getById(id), HttpStatus.OK);
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
