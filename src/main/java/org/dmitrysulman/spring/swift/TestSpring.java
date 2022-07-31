package org.dmitrysulman.spring.swift;

import org.dmitrysulman.spring.stepik.Pet;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext(
                "applicationContext2.xml"
        );

        TestBean testBean = context2.getBean("testBean", TestBean.class);
        System.out.println(testBean.getName());

        Pet pet = context2.getBean("petBean", Pet.class);
        pet.say();

        Music music = context2.getBean("musicBean", Music.class);
        System.out.println(music.getSong());
        MusicPlayer firstMusicPlayer = context2.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context2.getBean("musicPlayer", MusicPlayer.class);

        firstMusicPlayer.playMusicList();

        System.out.println(firstMusicPlayer.getName());
        System.out.println(firstMusicPlayer.getVolume());

        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);
        System.out.println(firstMusicPlayer == secondMusicPlayer);

        context2.close();


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        Music music1 = context.getBean("rockMusicTest", Music.class);
//        System.out.println(music1.getSong());
//
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();
//        musicPlayer.playMusicList();

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer.toString());
        context.close();
    }
}
