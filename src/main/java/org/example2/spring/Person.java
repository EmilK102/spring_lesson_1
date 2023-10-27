package org.example2.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("myPerson")
public class Person {
    private Pet pet;
    private String surname;
    private int age;

    @Autowired
    public Person(@Qualifier("myCat") Pet pet) {
        this.pet = pet;
    }

    public void sayYourPet(){
        pet.say();
    }
}
