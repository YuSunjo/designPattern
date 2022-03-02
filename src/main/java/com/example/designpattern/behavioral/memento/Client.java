package com.example.designpattern.behavioral.memento;

public class Client {

    public static void main(String[] args) {
        Game game = new Game();
        game.setBlueTeamScore(10);
        game.setRedTeamScore(10);

        GameSave gameSave = game.save();

        game.setBlueTeamScore(101);
        game.setRedTeamScore(111);

        game.restore(gameSave);
    }

}
