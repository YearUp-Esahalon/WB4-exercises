package com.pluralsight;

public class Room {

    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    public int getNumberOfBeds() {
        return this.numberOfBeds;
    }

    public double getPrice() {
        return this.getPrice();
    }

    public boolean isOccupied() {
        return occupied;

    }

    public boolean isDirty() {
        return this.dirty;
    }

    public boolean isAvailable() {
        return (!this.isDirty() && !this.isOccupied());
    }

    public boolean checkIn() {
        if (isAvailable()) {
            occupied = true;
            dirty = true;
        } else
            System.out.println(" This Room is not available");
        return false;
    }

    public Boolean checkOut() {
        if (occupied) {
            occupied = false;
            dirty = true;
        } else {
            System.out.println(" Room is unoccupied");
        }
        return null;
    }


}

