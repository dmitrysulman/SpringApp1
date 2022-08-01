package org.dmitrysulman.spring.swift;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component("rockMusicTest")
public class RockMusic implements Music {
    public static final String[] songs = {"Rock Song 1", "Rock Song 2", "Rock Song 3"};

    @Override
    public String getSong() {
        return "ROCK!";
    }

    @Override
    public String[] getSongs() {
        return songs;
    }
}
