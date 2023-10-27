package org.example;

import org.example.spring.Cat;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");


        Cat cat = context.getBean("myPet", Cat.class);
        Cat cat2 = context.getBean("myPet", Cat.class);

//        System.out.println(cat);
//        System.out.println(cat2);
//
//        cat.setName("Belka");
//        cat2.setName("Strelka");
//
//        System.out.println(cat2.getName());
        context.close();
    }
}
