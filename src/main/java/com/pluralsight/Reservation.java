package com.pluralsight;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Reservation {

    private String roomType;
    private double price;
    private int getNumberOfNights;
    private boolean weekend;


    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        double king = 139.00;

        if (roomType.equalsIgnoreCase("king")) {
            return king;
        }
        return 124;
    }


    public void setGetNumberOFnights(int getNumberOfNights) {
        this.getNumberOfNights= getNumberOfNights;
    }



    public boolean isWeekend(){
        LocalDate day = LocalDate.now();

        if(day.getDayOfWeek() == DayOfWeek.SATURDAY
        || day.getDayOfWeek() == DayOfWeek.SUNDAY){
            return true;
        }
        return false;
    }

    public void setWeekend(boolean isWeekend){
        this.weekend = isWeekend;
    }

    public double getReservationTotal(){

        if (isWeekend()) {
            return (price + (price * 0.10)) * getNumberOfNights;
        }
        return price * getNumberOfNights;
    }


}