package com.daria.train;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Passenger {

    private String passengerName;
    private LocalDate birthDate;
    private String passportNumber;

    public Passenger(String passengerName, String passportNumber, String birthDate) {
        LocalDate today = LocalDate.now();
        LocalDate newBirthDate = LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        if (((today.toEpochDay() - newBirthDate.toEpochDay()) / 365) > 1)  {
            this.passengerName = passengerName;
            this.birthDate = newBirthDate;
            this.passportNumber = passportNumber;
        } else {
            throw new IllegalArgumentException("Wrong year of birth.");
        }
    }

    public String getPassengerName() {
        return passengerName;
    }
}