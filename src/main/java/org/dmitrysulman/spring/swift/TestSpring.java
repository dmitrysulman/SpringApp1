package org.dmitrysulman.spring.swift;

import org.dmitrysulman.spring.stepik.Pet;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        TestBean testBean = context.getBean("testBean", TestBean.class);
//
//        System.out.println(testBean.getName());

        Pet pet = context.getBean("petBean", Pet.class);

        pet.say();

        context.close();
    }
}
