package org.example.spring;

public class Dog implements Pet{
    @Override
    public void say() {
        System.out.println("Gow-Gow");
    }
}