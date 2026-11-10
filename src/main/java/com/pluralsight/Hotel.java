package com.pluralsight;

public class Hotel {

    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;


    //constructor 1
    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }
    //constructor 2
    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedBasicRooms = bookedBasicRooms;
    }
    //added a book room method and logic
    public boolean bookRoom(int roomCount, boolean suite){
        if(roomCount <= 0){
            return false;
        }//if the user mentioned true for the suit.
        if (suite) {//increase the bookedSuites
            if (roomCount <= getAvailableSuites()) {
                bookedSuites += roomCount;
                return true;
            }
        } else {
            if (roomCount <= getAvailableRooms()) {
                bookedBasicRooms += roomCount;
                return true;
            }
        }
        return false;
    }

    //calculate the number of suites
    public int getAvailableSuites() {
        return numberOfSuites - bookedSuites;
    }

    //calculat the number of rooms available
    public int getAvailableRooms() {
        return numberOfRooms - bookedBasicRooms;
    }

}
