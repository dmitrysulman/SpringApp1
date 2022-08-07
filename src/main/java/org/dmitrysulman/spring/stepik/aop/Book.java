package org.dmitrysulman.spring.stepik.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Test book1.")
    private String name;

    public String getName() {
        return name;
    }
}
