package com.example.designpattern.abstractFactory.after;

import com.example.designpattern.factoryMethod.after.Ship;
import com.example.designpattern.factoryMethod.after.ShipFactory;

public class Client {
    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteShipFactory(new WhiteShipPartsFactory());
        Ship ship = shipFactory.createShip();
    }
}
