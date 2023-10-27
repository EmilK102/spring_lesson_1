package org.example.spring;

import org.springframework.stereotype.Component;

@Component("myCat")
public class Cat implements Pet{

//    private String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public Cat() {
        System.out.println("constructor");
    }

    public void init(){
        System.out.println("init");
    }
    public void destroy(){
        System.out.println("destroy");
    }

    @Override
    public void say() {
        System.out.println("Meow");
    }
}
