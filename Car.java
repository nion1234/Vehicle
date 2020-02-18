package com.company;

public class Car extends Vehicle{
   public int gear;
    public int seat;

    @Override
    public String toString() {
        return "Car{" +
                "gear=" + gear +
                ", seat=" + seat +
                '}';
    }

    public Car(String licensePlate, int gear, int seat) {
        super(licensePlate);
        this.gear = gear;
        this.seat = seat;

        }
        public void CarInfo(){
        System.out.println("Gear is :"+" "+gear);
        System.out.println("Seat is :"+seat);
        }
    }
