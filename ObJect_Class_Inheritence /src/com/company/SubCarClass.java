package com.company;

public class SubCarClass extends CarClass {

    private float chargingBattery;
    private String ColorString;

    public SubCarClass(){
        super();
    }
    public SubCarClass(String ManuFacturerName,String ModelName, String pass,  int EngineCC, float FuelAmount, float charge, String Color){
        super(ManuFacturerName, ModelName, pass, EngineCC, FuelAmount);
        chargingBattery = charge;
        ColorString = Color;
    }

    public String getColorString() {
        return ColorString;
    }
    public void setColorString(String colorString) {
        ColorString = colorString;
    }
    public float getChargingBattery() {
        return chargingBattery;
    }
    public void setChargingBattery(float chargingBattery) {
        this.chargingBattery = chargingBattery;
    }
}
