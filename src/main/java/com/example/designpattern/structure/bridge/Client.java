package com.example.designpattern.structure.bridge;

public class Client {
    public static void main(String[] args) {
        Champion poolPartyAri = new Ari(new PoolParty());
        poolPartyAri.skillE();
    }
}
