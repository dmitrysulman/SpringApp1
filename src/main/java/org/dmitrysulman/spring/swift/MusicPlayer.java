package org.dmitrysulman.spring.swift;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private Music music;
//    private PopMusic popMusic;
//    private RockMusic rockMusic;

    private List<Music> musicList = new ArrayList<>();

    private String name;
    private int volume;

    public MusicPlayer() {
    }

//    @Autowired
    public MusicPlayer(PopMusic popMusic, RockMusic rockMusic) {
//        this.popMusic = popMusic;
//        this.rockMusic = rockMusic;
        musicList.add(popMusic);
        musicList.add(rockMusic);
    }

    @Autowired
    public MusicPlayer(Music music) {
        System.out.println("CONSTRUCTOR HERE!");
        this.music = music;
    }

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

//    @Autowired
    public void setMusic(Music music) {
        System.out.println("SETTER HERE!");
        this.music = music;
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
