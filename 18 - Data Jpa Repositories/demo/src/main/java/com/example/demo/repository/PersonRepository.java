package com.example.demo.repository;

import com.example.demo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


//https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html

//Repository -> CrudRepository -> PagingAndSortingRepository -> JpaRepository

//Repository base interfase

//CrudRepository base CRUD operation
//--save()              -->          INSERT / UPDATE
//--saveAll()           -->          INSERT SOME ENTITY
//--findById()          -->          SELECT * FROM Book WHERE ID =
//--existsById()        -->          proverka na suwestvovaniya
//--findAll()           -->          SELECT * FROM BOOK
//--findAllById         -->          SELECT * FROM BOOK WHERE ID IN ()
//--count()             -->          SELECT COUNT(*) FROM BOOK
//--deleteById()        -->          DELETE FROM BOOK WHERE ID =
//--delete()            -->          DELETE FROM BOOK WHERE ID =
//--deleteAll()         -->          DELETE FROM BOOK

//PagingAndSortingRepository
//--findAll(Sort)
//--findAll(Pageable)

//JpaRepository
//--CrudRepository
//--PagingAndSortingRepository


//SELECT *  FROM [Java521].[dbo].[person] where year >= 1954
@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {

    List<Person> findAllByOrderByTitleAsc();
    List<Person> findAllByOrderByTitleDesc();
    Person findByYearBetween(Integer year1, Integer year2);
    List<Person> findAllByYearBetween(Integer age1, Integer age2);
//    List<Person> findByYearGreaterThanOrderByTitleAsc()
    List<Person> findByYearGreaterThan(int year);
    List<Person> findByYearBetween(int x, int y);
}



















