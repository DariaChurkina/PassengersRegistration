package com.daria.train;

import java.util.List;

public class Flight {
    private String flightNumber;
    private List<Passenger> passengersList;
    private List<Seat> seatsList;

    public Flight(String flightNumber, List<Seat> seatsList, List<Passenger> passengersList) {

        this.flightNumber = flightNumber;
        this.seatsList = seatsList;
        this.passengersList = passengersList;
    }

    public void addPassenger(Passenger passenger) {
        passengersList.add(passenger);
    }

    public void registerPassenger(Passenger passenger, Seat seat) {
            if(passengersList.contains(passenger)) {
                seat.setRegisteredPassenger(passenger);
            } else {
                System.out.println("This person is not in the list of passengers for this flight.");
        }
    }

    public void showAllSeats() {
        for (Seat seat : seatsList) {
            if (seat.getRegisteredPassenger() != null) {
                System.out.println(Integer.toString(seat.getRowNumber()) + seat.getSeatLetter() + " - " + seat.getRegisteredPassenger().getPassengerName());
            } else {
                System.out.println(Integer.toString(seat.getRowNumber()) + seat.getSeatLetter() + " - " + "X");
            }
        }
    }
}
