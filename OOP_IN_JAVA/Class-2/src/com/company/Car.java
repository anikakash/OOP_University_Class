package com.company;

public class Car extends Vehicle {
    public String CarName;
    public Car() {
        super();
    }

    @Override
    public void pr() {
        super.pr();
        System.out.println();
    }
}
