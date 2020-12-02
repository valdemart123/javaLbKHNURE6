package com.company;

public class TankerShip extends CargoShip {

    int displacement;


    public TankerShip (int displacement, int capacity, int cargoWeight) {
        this.capacity=capacity;
        this.cargoWeight=cargoWeight;
        this.displacement=displacement;
    }

    @Override
    public void getDisplacement() {
        System.out.println(displacement);
    }
}
