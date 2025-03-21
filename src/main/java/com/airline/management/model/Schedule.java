package com.airline.management.model;

import java.time.LocalDateTime;

public class Schedule {
    private Long id_28;
    private LocalDateTime departureTime_28;
    private LocalDateTime arrivalTime_28;
    private Long flightId_28;

    public Schedule() {}

    public Schedule(Long id_28, LocalDateTime departureTime_28, LocalDateTime arrivalTime_28, Long flightId_28) {
        this.id_28 = id_28;
        this.departureTime_28 = departureTime_28;
        this.arrivalTime_28 = arrivalTime_28;
        this.flightId_28 = flightId_28;
    }

    // Getters and Setters
    public Long getId_28() {
        return id_28;
    }

    public void setId_28(Long id_28) {
        this.id_28 = id_28;
    }

    public LocalDateTime getDepartureTime_28() {
        return departureTime_28;
    }

    public void setDepartureTime_28(LocalDateTime departureTime_28) {
        this.departureTime_28 = departureTime_28;
    }

    public LocalDateTime getArrivalTime_28() {
        return arrivalTime_28;
    }

    public void setArrivalTime_28(LocalDateTime arrivalTime_28) {
        this.arrivalTime_28 = arrivalTime_28;
    }

    public Long getFlightId_28() {
        return flightId_28;
    }

    public void setFlightId_28(Long flightId_28) {
        this.flightId_28 = flightId_28;
    }
}