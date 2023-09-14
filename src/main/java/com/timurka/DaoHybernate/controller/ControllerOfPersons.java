package com.timurka.DaoHybernate.controller;

import com.timurka.DaoHybernate.entity.Persons;
import com.timurka.DaoHybernate.repository.PersonsRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControllerOfPersons {
    private final PersonsRepository personsRepository;

    public ControllerOfPersons(PersonsRepository personsRepository) {
        this.personsRepository = personsRepository;
    }

    @GetMapping("/persons/by-city")
    public List<Persons> getPersons(@RequestParam String city) {
        return personsRepository.getPersonsByCity(city);
    }
}
