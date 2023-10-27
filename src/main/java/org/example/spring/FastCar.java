package org.example.spring;

import org.springframework.stereotype.Component;

@Component("fastCar")
public class FastCar implements Car{
    @Override
    public void goCar() {
        System.out.println("I am faster car");
    }
}
