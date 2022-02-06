package com.company;

interface Driving{
    public void Start();
    public void Stop();
}
interface Parking{
    public void ParkLeft();
    public void ParkRight();
}
interface Passenger{
    public void Individual();
    public void Group();
}
interface Light{
    public void On();
    public void Blink();
    public void Group();
}
abstract class car extends Vehicles implements Driving, Parking, Passenger, Light {
        private int licenseInformation;
        private int IssuingState;
        private int Model;
        public int year;
        public String color;
        public int CarIdentificationNum;


    public car(String bodyStyle, int carSegment, int fuelSize, String usePurpose) {
        super(bodyStyle, carSegment, fuelSize, usePurpose);
    }

    public car(String bodyStyle, int carSegment, int fuelSize, String usePurpose, int licenseInformation, int issuingState, int model, int year, String color, int carIdentificationNum) {
        super(bodyStyle, carSegment, fuelSize, usePurpose);
        this.licenseInformation = licenseInformation;
        IssuingState = issuingState;
        Model = model;
        this.year = year;
        this.color = color;
        CarIdentificationNum = carIdentificationNum;
    }

    public int getLicenseInformation() {
        return licenseInformation;
    }

    public void setLicenseInformation(int licenseInformation) {
        this.licenseInformation = licenseInformation;
    }

    public int getIssuingState() {
        return IssuingState;
    }

    public void setIssuingState(int issuingState) {
        IssuingState = issuingState;
    }

    public int getModel() {
        return Model;
    }

    public void setModel(int model) {
        Model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCarIdentificationNum() {
        return CarIdentificationNum;
    }

    public void setCarIdentificationNum(int carIdentificationNum) {
        CarIdentificationNum = carIdentificationNum;
    }
}

public class Vehicles {
    public String BodyStyle;
    public int CarSegment;
    public int FuelSize;
    public String UsePurpose;

    public Vehicles(String bodyStyle, int carSegment, int fuelSize, String usePurpose) {
        BodyStyle = bodyStyle;
        CarSegment = carSegment;
        FuelSize = fuelSize;
        UsePurpose = usePurpose;
    }
}
