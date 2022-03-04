package com.example.designpattern.behavioral.observer;

public class Client {
    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();
        User user1 = new User("sj");
        User user2 = new User("hello");

        chatServer.register("오징어게임", user1);
        chatServer.register("오징어게임", user2);
        chatServer.register("디자인패턴", user1);

        chatServer.sendMessage(user1, "오징어게임", "안녕~안녕");
        chatServer.sendMessage(user1, "디자인패턴", "가즈아");
    }

    // spring에서의 eventListener
}
