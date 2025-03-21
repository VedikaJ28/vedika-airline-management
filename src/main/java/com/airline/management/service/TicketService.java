package com.airline.management.service;

import com.airline.management.model.Ticket;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TicketService {
    private final List<Ticket> tickets_28 = new ArrayList<>();
    private Long ticketIdCounter_28 = 1L;

    public Ticket createTicket(Ticket ticket_28) {
        // Validation: Check if flight exists
        if (!flightExists(ticket_28.getFlightId_28())) {
            throw new RuntimeException("Flight not found");
        }

        // Validation: Check for duplicate seat
        boolean seatTaken_28 = tickets_28.stream()
                .anyMatch(t_28 -> t_28.getFlightId_28().equals(ticket_28.getFlightId_28()) && t_28.getSeatNumber_28().equals(ticket_28.getSeatNumber_28()));
        if (seatTaken_28) {
            throw new RuntimeException("Seat " + ticket_28.getSeatNumber_28() + " is already booked for this flight");
        }

        // Assign ID and save ticket
        ticket_28.setId_28(ticketIdCounter_28++);
        tickets_28.add(ticket_28);
        return ticket_28;
    }

    public Optional<Ticket> getTicketById(Long id_28) {
        return tickets_28.stream().filter(t_28 -> t_28.getId_28().equals(id_28)).findFirst();
    }

    public void deleteTicket(Long id_28) {
        Ticket ticket_28 = tickets_28.stream()
                .filter(t_28 -> t_28.getId_28().equals(id_28))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Ticket not found"));
        tickets_28.remove(ticket_28);
    }

    private boolean flightExists(Long flightId_28) {
        // In a real app, you'd check with FlightService; here we assume flight IDs 1+ exist
        return flightId_28 != null && flightId_28 > 0;
    }
}