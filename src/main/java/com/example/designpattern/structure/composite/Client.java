package com.example.designpattern.structure.composite;

public class Client {
    public static void main(String[] args) {

        Item blade = new Item("blade", 350);
        Item potion = new Item("potion", 50);
        Bag bag = new Bag();
        bag.add(blade);
        bag.add(potion);

        Client client = new Client();
        client.printPrice(blade);

    }

    // Item, Bag 클래스를 받는게 아니라 Component로 받아서 (추상적인 타입을 사용)
    private void printPrice(Component component) {
        System.out.println("component.getPrice() = " + component.getPrice());
    }

}
