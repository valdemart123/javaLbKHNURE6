package com.company;

public abstract class  CargoShip implements Ship {
    int capacity;
    int cargoWeight;

    public void getCargo() {
        System.out.println(capacity -=cargoWeight);
    }

    public abstract void getDisplacement();


}
