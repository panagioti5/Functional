package com.functionalinterface;

import com.entities.Person;
import com.infra.Gender;

import java.util.ArrayList;
import java.util.List;

public class _Stream {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Panagiotis", Gender.MALE));
        persons.add(new Person("Katerina", Gender.FEMALE));
        persons.add(new Person("Andreas", Gender.MALE));
        persons.add(new Person("Maria", Gender.FEMALE));
        persons.add(new Person("Christos", Gender.MALE));


    }



}
