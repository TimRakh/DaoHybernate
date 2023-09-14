package com.timurka.DaoHybernate.controller;

import com.timurka.DaoHybernate.entity.Repository;
import lombok.AllArgsConstructor;
import com.timurka.DaoHybernate.entity.Persons
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
public class ControllerOfPersons {

    private final Repository repository;


    @GetMapping("/persons/by-city")
    protected List<Persons> findPersonByCityOfLiving(@RequestParam (value = "city", required = false) String city) {
        return repository.findPersonByCityOfLiving(city);
    }
    @GetMapping("/persons/by-age")
    protected List<Persons> findPersonByContact_AgeBeforeOrderByContactAsc(@RequestParam(value = "age", required = false) Integer age){
        return repository.findPersonByContact_AgeBeforeOrderByContactAsc(age);
    }

    @GetMapping("/persons/by-name&surname")
    protected Optional<Persons> findPersonByContact_NameContainingIgnoreCaseAndAndContact_SurnameContainingIgnoreCase(@RequestParam(value = "name", required = false) String name,@RequestParam(value = "surname", required = false) String surname){
        return repository.findPersonByContact_NameContainingIgnoreCaseAndAndContact_SurnameContainingIgnoreCase(name, surname);
    }

}