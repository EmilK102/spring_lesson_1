package org.example2.spring;

import org.springframework.stereotype.Component;

@Component("myDog")
public class Dog implements Pet{
    @Override
    public void say() {
        System.out.println("Gouw-Gouw");
    }
}
