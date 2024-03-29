package com.example.designpattern.structure.proxy;

public class GameServiceProxy implements GameService {

    private GameService gameService;

    public GameServiceProxy(GameService gameService) {
        this.gameService = gameService;
    }

    @Override
    public void startGame() {
        long before = System.currentTimeMillis();
//        super.startGame();
        gameService.startGame();
        System.out.println(System.currentTimeMillis() - before);
    }

}
