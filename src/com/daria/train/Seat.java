package com.daria.train;

public class Seat {

    private int rowNumber;
    private SeatLetter seatLetter;
    private Passenger registeredPassenger;

    public Seat(int rowNumber, SeatLetter seatLetter) {
        if(rowNumber >= 1 || rowNumber <= 5) {
            this.rowNumber = rowNumber;
        } else {
            System.out.println("Inappropriate row number, please choose the value from 1 to 5.");
        }

        switch (seatLetter) {
            case A: case B: case C: case D:
                this.seatLetter = seatLetter;
                break;

            default:
                 System.out.println("The seat value is inappropriate, please choose the value from A to D.");
        }
    }

    public void setRegisteredPassenger(Passenger registeredPassenger) {
        this.registeredPassenger = registeredPassenger;
    }

    public Passenger getRegisteredPassenger() {
        return registeredPassenger;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public SeatLetter getSeatLetter() {
        return seatLetter;
    }
}