package org.dmitrysulman.spring.swift;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class PopMusic implements Music {
    private static final String[] songs = {"Pop Song 1", "Pop Song 2", "Pop Song 3"};

    @Override
    public String getSong() {
        return "POP!";
    }

    @Override
    public String[] getSongs() {
        return songs;
    }
}
