package com.example.designpattern.structure.proxy;

public class Client {
    public static void main(String[] args) {
        GameService gameServiceProxy = new GameServiceProxy(new DefaultGameService());
        gameServiceProxy.startGame();
    }
}
