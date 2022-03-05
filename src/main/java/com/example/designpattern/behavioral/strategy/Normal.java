package com.example.designpattern.behavioral.strategy;

public class Normal implements Speed{
    @Override
    public void blueLight() {
        System.out.println("normal blue");
    }

    @Override
    public void redLight() {
        System.out.println("normal red");
    }
}
