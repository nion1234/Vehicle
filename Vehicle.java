package com.company;

public class Vehicle {
    public String LicensePlate;

    public Vehicle(String licensePlate) {
        LicensePlate = licensePlate;
    }

    public String getLicensePlate() {
        return LicensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        LicensePlate = licensePlate;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "LicensePlate='" + LicensePlate + '\'' +
                '}';
    }
    public void Show(){
        System.out.println("The vehicle license is"+" "+LicensePlate);
    }
}
