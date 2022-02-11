package com.example.designpattern.factoryMethod.after;

public class WhiteShipFactory extends DefaultFactory {

    @Override
    public Ship createShip() {
        return new WhiteShip();
    }

}
