package com.example.designpattern.abstractFactory.after;

import com.example.designpattern.factoryMethod.after.DefaultFactory;
import com.example.designpattern.factoryMethod.after.Ship;
import com.example.designpattern.factoryMethod.after.WhiteShip;

public class WhiteShipFactory extends DefaultFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteShipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship whiteShip = new WhiteShip();
        whiteShip.setAnchor(shipPartsFactory.createAnchor());
        whiteShip.setWheel(shipPartsFactory.createWheel());
        return whiteShip;
    }

}
