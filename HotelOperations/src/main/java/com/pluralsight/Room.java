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

    public void checkIn() {
        if (isAvailable()) {
            this.occupied = true;
            this.dirty = true;
        } else
            System.out.println(" This Room is not available");
    }

    public void checkOut() {
        if (this.occupied) {
            this.occupied = false;
            this.dirty = true;
        } else {
            System.out.println(" Room is unoccupied");
        }
    }
    public void cleanRoom() {
        if (this.dirty) {
            this.dirty = false;
        }else{
            System.out.println("Room is already clean");
        }

    }


    }


