package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Employee e1 = new Employee(1, "Matt", "Tech", 10, 41);
        double totalPay = e1.getTotalPay();
        System.out.println(totalPay);
        System.out.println(e1.getRegularHours());
        System.out.println(e1.getOvertimeHours());


        Room room101 =new Room(2,150.0,false,false);

        Scanner scanner = new Scanner(System.in);
        String command = "";

        while(!command.equals("exit")) {
         // prompt user for the command
         System.out.println("\nEnter command (checkin, checkout,clean, exit):");
         command = scanner.nextLine().toLowerCase();
            // Use a while loop to allow user interaction
            while (!command.equals("exit")) {
                // Prompt the user for a command
                System.out.println("\nEnter command (checkin, checkout, clean, exit):");
                command = scanner.nextLine().toLowerCase(); // Read user input

                // Check the command using if-else statements
                if (command.equals("checkin")) {
                    // Attempt to check the guest into the room
                    room101.checkIn();
                    // Confirm if the room is now occupied
                    if (room101.isOccupied()) {
                        System.out.println("Guest checked in to Room 101.");
                    }

                } else if (command.equals("checkout")) {
                    // Attempt to check the guest out of the room
                    room101.checkOut();
                    // Confirm if the room is now unoccupied
                    if (!room101.isOccupied()) {
                        System.out.println("Guest checked out of Room 101. Room is now dirty.");
                    }

                } else if (command.equals("clean")) {
                    // Attempt to clean the room
                    room101.cleanRoom();
                    // Confirm if the room is now clean
                    if (!room101.isDirty()) {
                        System.out.println("Room 101 has been cleaned.");
                    }

                } else if (command.equals("exit")) {
                    // Exit command to break the loop
                    System.out.println("Exiting the program.");
                } else {
                    // Handle invalid commands
                    System.out.println("Invalid command. Try again.");
                }
            }

            // Close the scanner to free up resources
            scanner.close();
        }
    }

}

