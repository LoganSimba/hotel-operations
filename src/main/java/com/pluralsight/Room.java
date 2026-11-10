package com.pluralsight;

public class Room {

    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;
    private boolean available;
    private boolean checkIn;


    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean occupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isAvailable() {
        if(dirty == false && occupied == false){
            return true;
        }
        return false;
    }

    //method to check in, check if the room is available before
    public boolean checkIn(){
        if(isAvailable()){
            dirty = true;
            occupied = true;
            return true;
        }
        return false;
    }
    //added a method to check if its occupied
    public boolean checkOut(){
        if(occupied){
            occupied = false;
            dirty = true;
            return true;
        }
        return false;
    }

}
