package org.example.spring;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("singleton")
@Component("fastCar")
public class FastCar implements Car{
    private Person person;

    @Autowired
    public FastCar(Person person) {
        this.person = person;
        person.callYourPet();
    }

    public void getPersonInfo(){
        System.out.println(person.getAge() + " " + person.getSurname());
    }

    @PostConstruct
    private void init(){
        System.out.println("init");
    }
    @PreDestroy
    private void destroy(){
        System.out.println("destroy");
    }

    @Override
    public void goCar() {
        System.out.println("I am faster car");
    }
}
