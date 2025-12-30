package com.example.demo.controller.oldControllers;

import com.example.demo.entity.Person;
import com.example.demo.repository.PersonOldRepository;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/person/old/old")
public class PersonOldOldController {

    @Autowired
    private PersonOldRepository personOldRepository;
    @Autowired
    private Faker fakerData;


    private void generationData(int count) {
        if (personOldRepository.count() == 0) {

//            fakerData.name().firstName()
//            fakerData.name().fullName()
//            fakerData.name().fullName()



            for (int i = 0; i < count; i++) {
                Person person = new Person();

                String title = fakerData.book().title();
                int year = fakerData.number().numberBetween(1950, 2024);
                person.setYear(year);
                person.setTitle(title);

                personOldRepository.save(person);
            }
        }
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAll(Integer year) {
        generationData(100);
        return ResponseEntity.ok(personOldRepository.delete(year));
    }

//    @GetMapping("/all")
//    public ResponseEntity<?> getAll(Integer age) {
//        generationData(100);
//        return ResponseEntity.ok(personRepository.skubidu(age));
//    }


    // page = nomer stranici (numeraciya s 0)
    // size = kolicestvo itemov na 1 stranicu


//    @GetMapping("/all")
//    public ResponseEntity<?> getAll(Integer year ) {
//        return ResponseEntity.ok(personRepository.findByYearGreaterThan(year ));
//    }

//    @GetMapping("/all")
//    public ResponseEntity<?> getAll(Integer page, Integer size,String sort,boolean isAsc) {
//        generationData(100);
//
//        Sort s ;
//        if (isAsc) {
//            s = Sort.by(sort).ascending();
//        }else{
//            s = Sort.by(sort).descending();
//        }
//
//        Pageable pageable = PageRequest.of(page, size, s);
//        return ResponseEntity.ok(personRepository.findAll(pageable));
//    }

//    @GetMapping("/all")
//    public ResponseEntity<?> getAll() {
//        generationData(100);
//        Sort sort = Sort.by(Sort.Direction.ASC, "year");
//        return ResponseEntity.ok(personRepository.findAll(sort));
//    }

//    @GetMapping("/all")
//    public ResponseEntity<?> getAll() {
//        return ResponseEntity.ok(personRepository.findAll());
//    }
//
//
//    @PostMapping("/add")
//    public Person add(
//            @RequestBody @Valid Person person
//    ) {
//        return personRepository.save(person);
//    }
//
//
//
//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity<Void> deletById(@PathVariable(name = "id") Long id) {
//        System.out.println("Id => " + id);
//      boolean removed =  personRepository.existsById(id);
//
//        if (removed) {
//            personRepository.deleteById(id);
//            return ResponseEntity.noContent().build();//204
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//
//    @GetMapping("/getById/{id}")
//    public ResponseEntity<Person> getById(@PathVariable(name = "id") Long id) {
//        boolean removed = personRepository.existsById(id);
//        if (removed) {
//            return ResponseEntity.ok(personRepository.findById(id).get());
//        } else {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//        }
//    }
//
//    @PutMapping("/update/{id}")
//    public ResponseEntity<?> update(
//            @PathVariable Long id,
//            @RequestBody Person person
//    ) {
//
//
//        List<String> validationMessages = new ArrayList<>();
//
//        boolean isExist = personRepository.existsById(id);
//        if (isExist) {
//            var result = personRepository.findById(id).get();
//
//            if (person.getYear() > LocalDate.now().getYear()) {
//                validationMessages.add("Year cannot be greater than " + LocalDate.now().getYear());
//            }
//
//            if (person.getTitle() == null) {
//                validationMessages.add("Title cannot be null");
//            }
//
//            if (!validationMessages.isEmpty()) {
//                System.out.println("Error in update");
//                ErrorResponse response =  ErrorResponse.badRequest("Validation failed", validationMessages);
//                return ResponseEntity
//                        .status(HttpStatus.BAD_REQUEST)
//                        .body(response);
//            }
//
//            if (person.getTitle()!=null) {
//                result.setTitle(person.getTitle());
//            }
//
//            if (person.getYear()!=0) {
//                result.setYear(person.getYear());
//            }
//
//            personRepository.save(result);
//
//            return ResponseEntity.ok(personRepository.findById(id).get());
//        } else {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//        }
//    }


}
