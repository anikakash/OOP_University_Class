package com.company;

public class Vehicle {
    public String VehicleCatagory;
    public String ModelName;

    public Vehicle() {
        VehicleCatagory = "";
        ModelName = "";
    }

    public Vehicle(String VehicleCatagory, String ModelName) {
        this.VehicleCatagory = ModelName;
        this.ModelName = ModelName;
    }
    public void pr(){
        System.out.println("Hello");
    }
    public void sum(int x , int y){
        System.out.println("Sum = "+ x+y);
    }
    public void sum(){
        System.out.println("Sum = "+ 10+5);
    }
}
