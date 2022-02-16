package com.example.designpattern.structure.bridge;

public class DefaultChampion implements Champion {

    private Skin skin;

    private String name;

    public DefaultChampion(Skin skin, String name) {
        this.skin = skin;
        this.name = name;
    }

    @Override
    public void move() {
        System.out.printf("%s %s move\n%n", skin.getName(), this.name);
    }

    @Override
    public void skillQ() {
        System.out.printf("%s %s q\n%n", skin.getName(), this.name);
    }

    @Override
    public void skillW() {
        System.out.printf("%s %s w\n%n", skin.getName(), this.name);
    }

    @Override
    public void skillE() {
        System.out.printf("%s %s e\n%n", skin.getName(), this.name);
    }

    @Override
    public void skillR() {
        System.out.printf("%s %s r\n%n", skin.getName(), this.name);
    }
}
