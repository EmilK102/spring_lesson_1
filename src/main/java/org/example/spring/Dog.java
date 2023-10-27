package org.example.spring;

import org.springframework.stereotype.Component;

@Component("myDog")
public class Dog implements Pet{
    @Override
    public void say() {
        System.out.println("Gow-Gow");
    }
}
