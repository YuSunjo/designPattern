package com.example.designpattern.behavioral.strategy;

public class Faster implements Speed{
    @Override
    public void blueLight() {
        System.out.println("faster blue");
    }

    @Override
    public void redLight() {
        System.out.println("faster red");
    }
}
