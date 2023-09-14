package com.timurka.DaoHybernate.entity;

import com.timurka.DaoHybernate.model.Contact;
import com.timurka.DaoHybernate.entity.Persons;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Persons, Contact> {

    List<Persons> findPersonByCityOfLiving(String city);

    List<Persons> findPersonByContact_AgeBeforeOrderByContactAsc(Integer age);

    Optional<Persons> findPersonByContact_NameContainingIgnoreCaseAndAndContact_SurnameContainingIgnoreCase(String name, String surname);

}