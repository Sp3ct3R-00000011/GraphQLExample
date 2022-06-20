//package com.accenture.graphQLDemo.controller;
//
//import com.accenture.graphQLDemo.model.Person;
//import com.accenture.graphQLDemo.service.PersonServiceImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class PersonCOntroller {
//    @Autowired
//    private PersonServiceImpl personService;
//
//    @GetMapping("/add")
//    public Person add(@RequestBody Person p){
//        return personService.createPerson(p);
//    }
//
//}
