package com.example.designpattern.factoryMethod.after;

public class Client {

//    public static void main(String[] args) {
//        Ship whiteship = ShipFactory.orderShip("Whiteship", "keesun@mail.com");
//        System.out.println(whiteship);
//
//        Ship blackship = ShipFactory.orderShip("Blackship", "keesun@mail.com");
//        System.out.println(blackship);
//    }

    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteShipFactory(), "whiteship", "a");
    }

    // di를 사용
    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }

}
