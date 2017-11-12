package com.daria.train;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Passenger p1 = new Passenger("Alina Kruglova", "654729033", "2000-11-09");
        Passenger p2 = new Passenger("Michael Jackson", "633789903", "1987-01-23");
        Passenger p3 = new Passenger("Smesharik", "633111903", "2014-01-23");


        List<Seat> seatsList = new ArrayList<>();
        for(int i = 1; i <= 5; i++) {
            Seat seatA = new Seat(i, SeatLetter.A);
            seatsList.add(seatA);
            Seat seatB = new Seat(i, SeatLetter.B);
            seatsList.add(seatB);
            Seat seatC = new Seat(i, SeatLetter.C);
            seatsList.add(seatC);
            Seat seatD = new Seat(i, SeatLetter.D);
            seatsList.add(seatD);
        }

        List<Passenger> passengersList = new ArrayList<>();
        Flight flight001 = new Flight("FRA2017", seatsList, passengersList);
        flight001.addPassenger(p1);
        flight001.addPassenger(p2);
        flight001.addPassenger(p3);

        flight001.registerPassenger(p1, seatsList.get(2));
        flight001.registerPassenger(p2, seatsList.get(7));
        flight001.registerPassenger(p3, seatsList.get(14));

        flight001.showAllSeats();

    }
}