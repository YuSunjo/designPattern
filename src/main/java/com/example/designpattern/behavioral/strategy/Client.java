package com.example.designpattern.behavioral.strategy;

public class Client {

    public static void main(String[] args) {
        BlueLightRedLight game = new BlueLightRedLight();
        game.blueLight(new Normal());

        game.blueLight(new Faster());
    }

    // 기존의 코드를 건들이지 않음

}
