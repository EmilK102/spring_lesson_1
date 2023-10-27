package org.example;

import org.example.spring.Cat;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Cat cat = context.getBean("myPet", Cat.class);
        cat.say();
        context.close();
    }
}
