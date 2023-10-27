package org.example3.spring;


public class Person {
    private Pet pet;
    private String surname;
    private int age;

    public Person(Pet pet) {
        this.pet = pet;
    }

    public void sayYourPet(){
        pet.say();
    }
}
