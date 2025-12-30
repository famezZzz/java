package com.example.demo.repository;

import com.example.demo.dto.PersonDTO;
import com.example.demo.entity.Person;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
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
public interface PersonOldRepository extends JpaRepository<Person,Long> {

    List<Person> findAllByOrderByTitleAsc();
    List<Person> findAllByOrderByTitleDesc();
    Person findByYearBetween(Integer year1, Integer year2);
    List<Person> findAllByYearBetween(Integer age1, Integer age2);
//    List<Person> findByYearGreaterThanOrderByTitleAsc()
    List<Person> findByYearGreaterThan(int year);
    List<Person> findByYearBetween(int x, int y);



    //JPQL Java Persistence Query Language

//    @Query(value = "select * from Person WHERE year(GETDATE()) - year > :person_age",nativeQuery = true)
//    List<Person> skubidu(@Param("person_age") Integer personAge);

//    @Query(value = "select p from Person p WHERE 2024 - p.year > :person_age",nativeQuery = false)
//    List<Person> skubidu(@Param("person_age") Integer personAge);

    @Query(value = "select new com.example.demo.dto.PersonDTO(p.id,p.title,p.year) from Person p WHERE 2024 - p.year > :person_age",nativeQuery = false)
    List<PersonDTO> skubidu(@Param("person_age") Integer personAge);

    @Modifying
    @Transactional
    @Query(value = "delete from Person where year > :age",nativeQuery = true)
    int delete(@Param("age") Integer age);

    //update,delete insert
}

//10:35

















