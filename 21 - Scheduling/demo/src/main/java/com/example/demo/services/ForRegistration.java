package com.example.demo.services;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
//@Scope("singleton") // default
//@Scope("prototype") // na kajduyu ssilku noviy obyekt
//@Scope("request") // na kajdiy HTTP zapros noviy obyekt
//@Scope("session") // na  HTTP  sessiyu 1 noviy obyekt
//@Scope("application")
//@Scope("websocket")
public class ForRegistration {

//    @PostConstruct
//    public void intit() {
////vizivaetsa posle sozdaniya bina i vnedreniya  zavisimosti
//    }
//
//    @PreDestroy
//    public void destroy() {
////vizivaetsa pered unictojeniem bina
//    }

    public int id = 0;
    public static int count = 0;

    public ForRegistration() {
        id = ++count;
        System.out.println("Creat instance # " + id + " ForRegistration");
    }

    public boolean test() {
        return true;
    }
}
