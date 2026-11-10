package com.pluralsight;

public class HotelApp {
    public static void main(String[] args) {

    Room room = new Room(1, 124.00, false, false);

    //example to test when checked in
    boolean reserved = room.checkIn();

    //checking other conditions
    System.out.println("Occupied: " + room.occupied());
    System.out.println("Dirty: " + room.isDirty());
    System.out.println("is available: " + room.isAvailable());

        System.out.println("-----------");

    boolean reservedOver = room.checkOut();

    System.out.println("Occupied: " + room.occupied());
    System.out.println("Dirty: " + room.isDirty());
    System.out.println("is available: " + room.isAvailable());

        System.out.println("-------------");

        //test to check method that cleans room
        room.cleanRoom();

        System.out.println("Occupied: " + room.occupied());
        System.out.println("Dirty: " + room.isDirty());
        System.out.println("is available: " + room.isAvailable());

        System.out.println("----------");

        room.checkIn();
        System.out.println("Punch in time: " +room.punchIn(10));
        System.out.println("Punch in time: " +room.punchOut(12));


    }
}
