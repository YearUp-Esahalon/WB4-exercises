package com.pluralsight;

import org.junit.jupiter.api.Test; // Import the Test annotation from JUnit
import static org.junit.jupiter.api.Assertions.*; // Import assertion methods from JUnit

public class RoomTest {

    // Test checkIn method
    @Test // Indicates that this method is a test case
   public void testCheckIn() {
        // Create a new Room object
        Room room = new Room(2, 100.0, false, false);

        // Call the checkIn method to change the room's status
        room.checkIn(); // Attempt to check in

        // Verify that the room is now occupied after check-in
        assertTrue(room.isOccupied(), "Room should be occupied after someone checks in");

        // Verify that the room is now dirty after check-in
        assertTrue(room.isDirty(), "Room should be dirty after someonee checks in");
    }

    @org.junit.Test
    public void testCheckOut() {
        // create a new room object with the same properties utilizing same room parameter variables 
        Room room = new Room(2,100.0, false, false);

        //check in room to change its state
        room.checkIn();;

        // now use the checkout method to change the status of the room
        room.checkOut();

        // verify that the room is now unoccupied after the checkout method is called
        assertFalse(room.isOccupied(), "Room should not be occupied after guest checks out of room");

        // now you wanna verify that the room is still dirty after guest checkout
        assertTrue(room.isDirty(), "Room should stay dirty after checking out");

    }
}
