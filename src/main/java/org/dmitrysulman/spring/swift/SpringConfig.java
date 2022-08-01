package org.dmitrysulman.spring.swift;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
//@ComponentScan("org.dmitrysulman.spring")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public Music getPopMusic() {
        return new PopMusic();
    }

    @Bean
    public Music getRockMusic() {
        return new RockMusic();
    }

    @Bean
    public Music getClassicalMusic() {
        return ClassicalMusic.getClassicalMusic();
    }

    @Bean
    public List<Music> getMusicList() {
//        List<Music> musicList = new ArrayList<>();
//        musicList.add(getPopMusic());
//        musicList.add(getClassicalMusic());
//        musicList.add(getRockMusic());
//        return musicList;
        return Arrays.asList(getPopMusic(), getClassicalMusic(), getRockMusic());
    }

    @Bean
    public MusicPlayer getMusicPlayer() {
        return new MusicPlayer(getMusicList());
    }

    @Bean
    public Computer getComputer() {
        return new Computer(getMusicPlayer());
    }
}
