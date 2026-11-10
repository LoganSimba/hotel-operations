package com.pluralsight;

public class Hotel {

    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedBasicRooms;
    private int kingSuites;
    private int numberOfDoublerooms;



    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public boolean bookRoom(int roomCount, boolean suite){
        if(numberOfRooms > 0){
            if(suite){
                numberOfSuites -= roomCount;
            }
            else{
                numberOfDoublerooms -= roomCount;
            }
            numberOfRooms -= roomCount;
        }
        return false;
    }


    public int getAvailableSuites(){
        if(kingSuites > 0){
            return kingSuites;
        }
        return 0;
    }


}
