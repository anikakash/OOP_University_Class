package com.company;

import org.jetbrains.annotations.NotNull;

public class CarClass {
    public String ManuFacturerName;
    private String pass;
    private String ModelName;
    public int EngineCC;
    private float FuelAmount;
    final private float FuelComsumptionsPerSec = 0.02f;

    public  CarClass(){
        ManuFacturerName = "";
        ModelName = "";
        EngineCC = 0;
        FuelAmount = 0;
    }

    public  CarClass(String CarName){
        ManuFacturerName = new String(CarName);
        ModelName = "";
        EngineCC = 0;
        FuelAmount = 0;
    }
    public  CarClass(String ManuFacturerName,String ModelName, String pass,  int EngineCC, float FuelAmount){
        this.ManuFacturerName = ManuFacturerName;
        this.ModelName = ModelName;
        this.pass = pass;
        this.EngineCC = EngineCC;
        this.FuelAmount =  FuelAmount;
    }

    public float PresentAmountOfFuel(){
        return FuelAmount;
    }
    public String GetManuFacturerName(){
        return ManuFacturerName;
    }
    public String GetModelName(){
        return ModelName;
    }
    public boolean CheckPass(@NotNull String userInput){
        return userInput.equals(pass);
    }
    public void FuelAdd(float FuelAmount){
        this.FuelAmount+=FuelAmount;
    }
    public void RunCarForSec(int sec){
        float UsedFuel = FuelComsumptionsPerSec*sec;
        FuelAmount-=UsedFuel;
    }
}
