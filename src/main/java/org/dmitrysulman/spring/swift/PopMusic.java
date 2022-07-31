package org.dmitrysulman.spring.swift;

import org.springframework.stereotype.Component;

//@Component
public class PopMusic implements Music {
    @Override
    public String getSong() {
        return "POP!";
    }
}
