package com.sparta.week01homework.controller;


import com.sparta.week01homework.domain.Person;
import com.sparta.week01homework.domain.PersonRepository;
import com.sparta.week01homework.domain.PersonRequestDto;
import com.sparta.week01homework.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PersonController {

    public final PersonRepository personRepository;

    public final PersonService personService;

    @PostMapping("/api/courses")
    public Person createPerson(@RequestBody PersonRequestDto requestDto) {
        Person person = new Person(requestDto);
        return personRepository.save(person);
    }

    @GetMapping("/api/persons")
    public List<Person> getPerson() {
        return personRepository.findAll();
    }

    @PutMapping("/api/persons/{id}")
    public Long updatePerson(@PathVariable Long id, @RequestBody PersonRequestDto requestDto) {

        return personService.update(id, requestDto);
    }

    @DeleteMapping("/api/persons/{id}")
    public Long deletePerson(@PathVariable Long id) {
        personRepository.deleteById(id);
        return id;

    }
}
