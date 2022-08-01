package org.dmitrysulman.spring.swift;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Random;

@Component
@Scope("prototype")
public class Computer {
    private final int id;
    private final MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.id = new Random().nextInt();
        this.musicPlayer = musicPlayer;
    }

    public void playRockMusic() {
        musicPlayer.playMusic(Genre.ROCK);
        System.out.println("Name: " + musicPlayer.getName() + ", Volume: " + musicPlayer.getVolume());
    }

    public void playPopMusic() {
        musicPlayer.playMusic(Genre.POP);
    }

    public void playRandomMusic() {
        musicPlayer.playRandomMusic();
    }

    @Override
    public String toString() {
        return "Computer " + id + " playing ";// + musicPlayer.getMusic().getSong();
    }

    @PostConstruct
    public void init() {
        System.out.println("Computer " + id + " init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Computer " + id + " destroy");
    }
}
