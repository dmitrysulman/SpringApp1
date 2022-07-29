package org.dmitrysulman.spring.stepik;

public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("bow-wow");
    }
}
