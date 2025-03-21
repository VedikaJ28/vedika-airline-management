package com.airline.management.service;

import com.airline.management.model.Flight;
import com.airline.management.model.Schedule;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FlightService {
    private final List<Flight> flights_28 = new ArrayList<>();

    // Constructor to initialize sample data
    public FlightService() {
        Flight flight_28 = new Flight(1L, "AA101", "NYC", "LAX");
        Schedule schedule_28 = new Schedule(1L, LocalDateTime.of(2025, 3, 22, 10, 0), LocalDateTime.of(2025, 3, 22, 14, 0), 1L);
        flight_28.getSchedules_28().add(schedule_28);
        flights_28.add(flight_28);
    }

    public List<Flight> getAllFlights(String sort_28) {
        List<Flight> result_28 = new ArrayList<>(flights_28);
        if ("asc".equalsIgnoreCase(sort_28)) {
            result_28.sort((f1_28, f2_28) -> f1_28.getFlightNumber_28().compareTo(f2_28.getFlightNumber_28()));
        }
        return result_28;
    }

    public Optional<Flight> getFlightById(Long id_28) {
        return flights_28.stream().filter(f_28 -> f_28.getId_28().equals(id_28)).findFirst();
    }

    public List<Schedule> getFlightSchedules(Long flightId_28) {
        return flights_28.stream()
                .filter(f_28 -> f_28.getId_28().equals(flightId_28))
                .findFirst()
                .map(Flight::getSchedules_28)
                .orElse(new ArrayList<>());
    }
}