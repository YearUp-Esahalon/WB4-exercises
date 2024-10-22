package com.pluralsight;

public class Reservation {

    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean isWeekend;
    private double reservationTotal;

    public Reservation(String roomType, double price, int numberOfNights, boolean isWeekend, double reservationTotal) {
        this.roomType = roomType;
        this.price = price;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
        this.reservationTotal = reservationTotal;
    }

    public String getRoomType() {
        return roomType;

    }

    public double getPrice() {

        if (this.roomType.equalsIgnoreCase("King")){
            return 139.0;
        } else if(this.roomType.equalsIgnoreCase("Double")) {
            return 124.0;
        }
            return 0.0;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public double getReservationTotal() {
        return reservationTotal;
    }

    public void setRoomType(String roomType) {
        if (roomType.equals("king")){
            this.roomType = roomType;
        }else if (roomType.equals("double")) {
            this.roomType = roomType;
        }
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public void setReservationTotal(double reservationTotal) {
        this.reservationTotal = reservationTotal;
    }
}
