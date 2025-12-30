package com.example.demo.controller;

import com.example.demo.entity.Person;
import com.example.demo.repository.PersonRepository;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/home")
public class HomeController {


    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private Faker fakerData;


    @GetMapping("/people")
    public String getAll(Model model) {

        List<Person> people = personRepository.findAll();
        model.addAttribute("people", people);
        model.addAttribute("pageName", "Home page");

        return "home";
    }
    @GetMapping("/addAll")
    public String addAll(Model model) {

        generationData(10);
        List<Person> people = personRepository.findAll();
        model.addAttribute("people", people);
        model.addAttribute("pageName", "Home page");

        return "home";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("pageName", "Create page");

        return "create";
    }

    @PostMapping("/create")
    public String add(Person person,Model model) {
        personRepository.save(person);
        List<Person> people = personRepository.findAll();
        model.addAttribute("people", people);
        return "home";
    }

    @GetMapping("/clear")
    public String clear(Model model) {

        personRepository.deleteAll();

        List<Person> people = personRepository.findAll();
        model.addAttribute("people", people);
        model.addAttribute("pageName", "Home page");

        return "home";
    }



    private void generationData(int count) {
        if (personRepository.count() == 0) {
            for (int i = 0; i < count; i++) {
                String name = fakerData.name().name();
                String firstName = fakerData.name().firstName();
                int age = fakerData.number().numberBetween(1,100);
                personRepository.save(new Person(name, firstName, age));
            }
        }
    }

}
