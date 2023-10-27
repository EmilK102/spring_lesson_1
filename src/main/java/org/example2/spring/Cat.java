package org.example2.spring;

import org.springframework.stereotype.Component;

@Component("myCat")
public class Cat implements Pet{
    @Override
    public void say() {
        System.out.println("Meow");
    }
}
