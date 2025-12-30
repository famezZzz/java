package com.example.demo.services.impl;

import com.example.demo.dto.PersonDTO;
import com.example.demo.entity.Person;
import com.example.demo.repository.PersonRepository;
import com.example.demo.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceFile    implements PersonService{

    @Autowired
    private PersonRepository personRepository;

    public PersonServiceFile(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    private PersonDTO convertToDTO(Person person) {
        return new PersonDTO(person.getId(), person.getTitle(), person.getYear());
    }

    private Person convertToEntity(PersonDTO personDTO) {
        return new Person(personDTO.getId(), personDTO.getTitle(), personDTO.getYear());
    }

    
    public PersonDTO create(PersonDTO personDTO) {
        return null;
    }

    
    public List<PersonDTO> createMultiple(List<PersonDTO> personDTO) {
        return List.of();
    }

    @Override
    public ResponseEntity<PersonDTO> test(PersonDTO personDTO) {
        return null;
    }

    @Override
    public List<PersonDTO> speedData() {
        return List.of();
    }


    public List<PersonDTO> getAll() {
        return personRepository.findAll().stream().map(this::convertToDTO).toList();
    }

    
    public PersonDTO getById(Long id) {
        return null;
    }

    
    public PersonDTO getByTitle(String title) {
        return null;
    }

    
    public List<PersonDTO> getAllSortedByTitle(boolean ascending) {
        return List.of();
    }

    
    public List<PersonDTO> getAllSortedByYear(boolean ascending) {
        return List.of();
    }

    
    public List<PersonDTO> getAllWithPaginationAndSorting(int page, int size, String sortBy) {
        return List.of();
    }

    
    public PersonDTO updatePerson(Long id, PersonDTO personDTO) {
        return null;
    }

    
    public PersonDTO updatePersonTitle(Long id, String title) {
        return null;
    }

    
    public PersonDTO updatePersonYear(Long id, Integer year) {
        return null;
    }

    
    public void delete(Long id) {

    }

    
    public void deleteAll() {

    }

    
    public void deleteAllByTitle(String title) {

    }

    
    public void deleteAllByYearRange(Integer start, Integer end) {

    }

    
    public void deleteAllOlderThan(Integer year) {

    }

    
    public void deleteAllYoungThan(Integer year) {

    }

    
    public List<PersonDTO> findAllByYearRange(Integer start, Integer end) {
        return List.of();
    }

    
    public List<PersonDTO> findAllByYoungedThan(Integer year) {
        return List.of();
    }

    
    public List<PersonDTO> findAllByOlderThan(Integer year) {
        return List.of();
    }

    
    public List<PersonDTO> findAllByTitleKey(String key) {
        return List.of();
    }

    
    public List<PersonDTO> findAllOlderThanAge(Integer age) {
        return List.of();
    }

    
    public List<PersonDTO> findAllByMinYearAndTitleKey(Integer year, String key) {
        return List.of();
    }

    
    public Long getTotalCount() {
        return 0L;
    }

    
    public Long countByYearRange(Integer start, Integer end) {
        return 0L;
    }

    
    public boolean existsById(Long id) {
        return false;
    }

    
    public boolean existsByTitle(String title) {
        return false;
    }
}
