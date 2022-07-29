package org.dmitrysulman.spring.stepik;

public class Cat implements Pet {
    @Override
    public void say() {
        System.out.println("meow-meow");
    }
}
