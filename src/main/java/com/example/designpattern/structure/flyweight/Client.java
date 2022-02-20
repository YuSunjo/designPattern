package com.example.designpattern.structure.flyweight;

public class Client {
    public static void main(String[] args) {
        FontFactory fontFactory = new FontFactory();
        // fontFactory의 메모리를 공유 -> 조금 줄일 수 있음
        new Character('h', "white", fontFactory.getFont("aaa:12"));
        new Character('h', "white", fontFactory.getFont("aaa:12"));
        new Character('h', "white", fontFactory.getFont("aaa:12"));
    }
}
