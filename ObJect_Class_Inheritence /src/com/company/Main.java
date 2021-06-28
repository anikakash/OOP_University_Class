package com.company;

public class Main {

    static private CarClass car2 ;

    public static void main(String[] args) {
        CarClass car1;
        car1 = new CarClass("MAZDA"," Axela", "asdf", 1500, 20); //not use car 1;
        car2 = new CarClass("TOYOTA", "Allion", "qwert", 1500, 30);

        //Authentication For Char INFO
        if(car2.CheckPass("qwert")){
            System.out.println("Manu Facturer Name : " + car2.ManuFacturerName);
            System.out.println("Car Model Name : " +car2.GetModelName());
        }else {
            System.out.println("Sorry! You Can't Access My Car InFo");
        }
        System.out.println("Amount of Fuel : " + car2.PresentAmountOfFuel() + " L");
        car2.FuelAdd(10.5f);
        System.out.println("Amount of Fuel After Refile : " + car2.PresentAmountOfFuel() + " L");
        car2.RunCarForSec(60);
        System.out.println("Amount of Fuel After Running 60 Sec : " + car2.PresentAmountOfFuel() + " L");

        System.out.println("NOW See inheritance : "); //Create A Super Care Using Inheritance;

        SubCarClass OurSpecialCar = new SubCarClass("BMW", "7 Series", "SuperCar", 1500, 25, 10, "Blue");
        System.out.println("\nWe are Making a Super Car Using Inheritance : \n\n");

        if(OurSpecialCar.CheckPass("SuperCar")){
            System.out.println("Manu Facturer Name : " + OurSpecialCar.ManuFacturerName);
            System.out.println("Car Model Name : " +OurSpecialCar.GetModelName());
        }else {
            System.out.println("Sorry! You Can't Access My Car InFo");
        }
        System.out.println("Amount of Fuel : " + OurSpecialCar.PresentAmountOfFuel() + " L");
        car2.FuelAdd(10.5f);
        System.out.println("Amount of Fuel After Refile : " + OurSpecialCar.PresentAmountOfFuel() + " L");
        car2.RunCarForSec(60);
        System.out.println("Amount of Fuel After Running 60 Sec : " + OurSpecialCar.PresentAmountOfFuel() + " L");

        //Check Getter And Setter;
        System.out.println("Car Charge "+ OurSpecialCar.getChargingBattery());
        OurSpecialCar.setChargingBattery(5.5f);
        System.out.println("Car Charge "+ OurSpecialCar.getChargingBattery());
        System.out.println("Car Color "+ OurSpecialCar.getColorString());
    }
}
