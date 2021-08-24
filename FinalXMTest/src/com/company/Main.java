package com.company;

interface car{
    void start();
}
interface person{
    void walk();
}
interface transform{
    void transforming();
}

class Robot implements car, person, transform{
    @Override
    public void transforming() {
        System.out.println("Robot Transforming Start");
    }
    @Override
    public void start() {
        System.out.println("Robot Engine Starting");
    }

    @Override
    public void walk() {
        System.out.println("Transfor Robot Start Walking");
    }
}

public class Main {

    public static void main(String[] args) {
        Robot rb = new Robot();
        rb.transforming();
        rb.start();
        rb.walk();
    }
}


