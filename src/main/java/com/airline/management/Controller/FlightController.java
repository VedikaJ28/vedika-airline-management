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
    private FlightService flightService;

    @GetMapping
    public List<Flight> getAllFlights(@RequestParam(required = false) String sort) {
        return flightService.getAllFlights(sort);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Flight> getFlightById(@PathVariable Long id) {
        return flightService.getFlightById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/{id}/schedules")
    public ResponseEntity<List<Schedule>> getFlightSchedules(@PathVariable Long id) {
        List<Schedule> schedules = flightService.getFlightSchedules(id);
        if (schedules.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(schedules);
    }
}
