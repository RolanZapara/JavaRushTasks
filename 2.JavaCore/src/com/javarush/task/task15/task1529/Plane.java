package com.javarush.task.task15.task1529;

public class Plane implements CanFly {
    int passengerNumber;

    public Plane(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    @Override
    public void fly() {}
}
