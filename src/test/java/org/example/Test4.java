package org.example;

import org.example.spring.FastCar;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext4.xml");
        FastCar fastCar = context.getBean("fastCar", FastCar.class);
        fastCar.goCar();
        fastCar.getPersonInfo();
        context.close();
    }
}
