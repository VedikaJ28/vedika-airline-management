package com.airline.management.controller;

import com.airline.management.model.Flight;
import com.airline.management.model.Schedule;
import com.airline.management.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    private FlightService flightService_28;

    @GetMapping
    public List<Flight> getAllFlights(@RequestParam(required = false) String sort_28) {
        return flightService_28.getAllFlights(sort_28);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Flight> getFlightById(@PathVariable Long id_28) {
        return flightService_28.getFlightById(id_28)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/{id}/schedules")
    public List<Schedule> getFlightSchedules(@PathVariable Long id_28, @RequestParam(required = false) String dates_28) {
        // Ignoring 'dates' filter for simplicity
        return flightService_28.getFlightSchedules(id_28);
    }
}