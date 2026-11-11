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
        assertFalse(roomTest.isAvailable());// fixed the problem with assertFalse, cause when u check in room isnt available
        assertTrue(roomTest.isDirty());


    }

    @Test// jUnit test the checkout method
    public void checkout_should_turn_dirty_true_and_occupied_false(){

        //Arrange
        Room roomTest = new Room(2,124,true,false);

        //act
        boolean checkOut = roomTest.checkOut();

        //assert
        assertTrue(checkOut);
        assertFalse(roomTest.occupied());// asseert to false, because room is not occupied after checking out
        assertTrue(roomTest.isDirty());

    }

}