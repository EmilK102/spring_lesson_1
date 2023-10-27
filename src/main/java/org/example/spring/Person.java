package org.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("myPerson")
public class Person {
    private Pet pet;
    private String surname;
    private  int age;

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }
//    public Person(Pet pet) {
//        this.pet = pet;
//    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Autowired
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
