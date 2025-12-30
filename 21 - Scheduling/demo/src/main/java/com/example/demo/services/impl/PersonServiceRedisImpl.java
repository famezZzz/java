package com.example.demo.services.impl;

import com.example.demo.dto.PersonDTO;
import com.example.demo.repository.PersonRepository;
import com.example.demo.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceRedisImpl implements PersonService {
    @Autowired
    private PersonRepository personRepository;

    @Override
    public PersonDTO create(PersonDTO personDTO) {
        return null;
    }

    @Override
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

    @Override
    public List<PersonDTO> getAll() {
        return List.of();
    }

    @Override
    public PersonDTO getById(Long id) {
        return null;
    }

    @Override
    public PersonDTO getByTitle(String title) {
        return null;
    }

    @Override
    public List<PersonDTO> getAllSortedByTitle(boolean ascending) {
        return List.of();
    }

    @Override
    public List<PersonDTO> getAllSortedByYear(boolean ascending) {
        return List.of();
    }

    @Override
    public List<PersonDTO> getAllWithPaginationAndSorting(int page, int size, String sortBy) {
        return List.of();
    }

    @Override
    public PersonDTO updatePerson(Long id, PersonDTO personDTO) {
        return null;
    }

    @Override
    public PersonDTO updatePersonTitle(Long id, String title) {
        return null;
    }

    @Override
    public PersonDTO updatePersonYear(Long id, Integer year) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteAllByTitle(String title) {

    }

    @Override
    public void deleteAllByYearRange(Integer start, Integer end) {

    }

    @Override
    public void deleteAllOlderThan(Integer year) {

    }

    @Override
    public void deleteAllYoungThan(Integer year) {

    }

    @Override
    public List<PersonDTO> findAllByYearRange(Integer start, Integer end) {
        return List.of();
    }

    @Override
    public List<PersonDTO> findAllByYoungedThan(Integer year) {
        return List.of();
    }

    @Override
    public List<PersonDTO> findAllByOlderThan(Integer year) {
        return List.of();
    }

    @Override
    public List<PersonDTO> findAllByTitleKey(String key) {
        return List.of();
    }

    @Override
    public List<PersonDTO> findAllOlderThanAge(Integer age) {
        return List.of();
    }

    @Override
    public List<PersonDTO> findAllByMinYearAndTitleKey(Integer year, String key) {
        return List.of();
    }

    @Override
    public Long getTotalCount() {
        return 0L;
    }

    @Override
    public Long countByYearRange(Integer start, Integer end) {
        return 0L;
    }

    @Override
    public boolean existsById(Long id) {
        return false;
    }

    @Override
    public boolean existsByTitle(String title) {
        return false;
    }
}
