package com.airline.management.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Ticket {
    @JsonProperty("id")
    private Long id_28;

    @JsonProperty("passengerName")
    private String passengerName_28;

    @JsonProperty("seatNumber")
    private String seatNumber_28;

    @JsonProperty("flightId")
    private Long flightId_28;

    public Ticket() {}

    public Ticket(Long id_28, String passengerName_28, String seatNumber_28, Long flightId_28) {
        this.id_28 = id_28;
        this.passengerName_28 = passengerName_28;
        this.seatNumber_28 = seatNumber_28;
        this.flightId_28 = flightId_28;
    }

    // Getters and Setters remain the same
    public Long getId_28() {
        return id_28;
    }

    public void setId_28(Long id_28) {
        this.id_28 = id_28;
    }

    public String getPassengerName_28() {
        return passengerName_28;
    }

    public void setPassengerName_28(String passengerName_28) {
        this.passengerName_28 = passengerName_28;
    }

    public String getSeatNumber_28() {
        return seatNumber_28;
    }

    public void setSeatNumber_28(String seatNumber_28) {
        this.seatNumber_28 = seatNumber_28;
    }

    public Long getFlightId_28() {
        return flightId_28;
    }

    public void setFlightId_28(Long flightId_28) {
        this.flightId_28 = flightId_28;
    }
}
