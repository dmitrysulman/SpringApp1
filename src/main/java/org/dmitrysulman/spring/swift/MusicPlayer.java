package org.dmitrysulman.spring.swift;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    private Music music;
    private Music popMusic;
    private Music rockMusic;

    private List<Music> musicList; // = new ArrayList<>();

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    //    public MusicPlayer() {
//    }

//    @Autowired
//    public MusicPlayer(@Qualifier("popMusic") Music popMusic, @Qualifier("rockMusicTest") Music rockMusic) {
//        this.popMusic = popMusic;
//        this.rockMusic = rockMusic;
//        musicList.add(popMusic);
//        musicList.add(rockMusic);
//    }

//    @Autowired
//    public MusicPlayer(@Qualifier("rockMusicTest") Music music) {
//        System.out.println("CONSTRUCTOR HERE!");
//        this.music = music;
//    }

    private void init() {
        System.out.println("Init MusicPlayer.");
    }

    private void destroy() {
        System.out.println("Destroy MusicPlayer.");
    }

    public void playMusic() {
        System.out.println("Playing " + music.getSong());
    }

    public void playMusicList() {
        musicList.forEach(x -> System.out.println("Playing " + x.getSong()));
    }

    public void playMusic(Genre genre) {
        switch (genre) {
            case ROCK -> System.out.println(rockMusic.getSongs()[new Random().nextInt(3)]);
            case POP -> System.out.println(popMusic.getSongs()[new Random().nextInt(3)]);
        }
    }

//    @Autowired
    public void setMusic(Music music) {
        System.out.println("SETTER HERE!");
        this.music = music;
    }

    public void playRandomMusic() {
        System.out.println(musicList.get(new Random().nextInt(3)).getSong());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public Music getMusic() {
        return music;
    }
}
