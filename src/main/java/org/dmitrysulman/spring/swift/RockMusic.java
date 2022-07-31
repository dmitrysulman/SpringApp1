package org.dmitrysulman.spring.swift;

import org.springframework.stereotype.Component;

@Component("rockMusicTest")
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "ROCK!";
    }
}
