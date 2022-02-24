package com.example.designpattern.behavioral.command;

public class Button {

    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }

    // 메서드의 이름이 바뀐다면 Button은 바뀌지 않고 GameStartCommand 만 바뀜

    public static void main(String[] args) {
        Button button = new Button(new GameStartCommand(new Game()));
        button.press();
    }

}
