package org.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("fastCar")
public class FastCar implements Car{
    private Person person;

    @Autowired
    public FastCar(Person person) {
        this.person = person;
        person.callYourPet();
    }

    @Override
    public void goCar() {
        System.out.println("I am faster car");
    }
}
