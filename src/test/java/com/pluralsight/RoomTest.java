package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    @Test
    public void checkIn_shouldOccupyAndDirtyRoom_whenRoomIsAvailable(){
       //Arrange
        Room roomTest = new Room(2,124,false,false);

        //act
       boolean checkIn = roomTest.checkIn();


        //assert
        assertTrue(roomTest.occupied());
        assertTrue(roomTest.isDirty());
       // assertTrue(roomTest.isAvailable());// this has a problem
        assertTrue(roomTest.isDirty());


    }

}