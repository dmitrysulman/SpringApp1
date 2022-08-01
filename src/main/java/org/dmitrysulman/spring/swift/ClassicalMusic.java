package org.dmitrysulman.spring.swift;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        System.out.println("FACTORY");
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("Initialization...");
    }

    public void doMyDestroy() {
        System.out.println("Destroying...");
    }

    @Override
    public String getSong() {
        return "CLASSICAL!";
    }

    @Override
    public String[] getSongs() {
        return null;
    }
}
