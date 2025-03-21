package com.airline.management.model;

import java.util.ArrayList;
import java.util.List;

public class Flight {
    private Long id_28;
    private String flightNumber_28;
    private String origin_28;
    private String destination_28;
    private List<Schedule> schedules_28;

    public Flight() {
        this.schedules_28 = new ArrayList<>();
    }

    public Flight(Long id_28, String flightNumber_28, String origin_28, String destination_28) {
        this.id_28 = id_28;
        this.flightNumber_28 = flightNumber_28;
        this.origin_28 = origin_28;
        this.destination_28 = destination_28;
        this.schedules_28 = new ArrayList<>();
    }

    // Getters and Setters
    public Long getId_28() {
        return id_28;
    }

    public void setId_28(Long id_28) {
        this.id_28 = id_28;
    }

    public String getFlightNumber_28() {
        return flightNumber_28;
    }

    public void setFlightNumber_28(String flightNumber_28) {
        this.flightNumber_28 = flightNumber_28;
    }

    public String getOrigin_28() {
        return origin_28;
    }

    public void setOrigin_28(String origin_28) {
        this.origin_28 = origin_28;
    }

    public String getDestination_28() {
        return destination_28;
    }

    public void setDestination_28(String destination_28) {
        this.destination_28 = destination_28;
    }

    public List<Schedule> getSchedules_28() {
        return schedules_28;
    }

    public void setSchedules_28(List<Schedule> schedules_28) {
        this.schedules_28 = schedules_28;
    }
}