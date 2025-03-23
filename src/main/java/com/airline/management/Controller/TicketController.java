package com.airline.management.controller;

import com.airline.management.model.Ticket;
import com.airline.management.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    @Autowired
    private TicketService ticketService_28;

    @PostMapping
    public Ticket createTicket(@RequestBody Ticket ticket) {
        // Map JSON properties to the model with _28 suffix
        Ticket mappedTicket = new Ticket();
        mappedTicket.setPassengerName_28(ticket.getPassengerName_28());
        mappedTicket.setSeatNumber_28(ticket.getSeatNumber_28());
        mappedTicket.setFlightId_28(ticket.getFlightId_28());

        return ticketService_28.createTicket(mappedTicket);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ticket> getTicketById(@PathVariable Long id) {
        return ticketService_28.getTicketById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTicket(@PathVariable Long id) {
        ticketService_28.deleteTicket(id);
        return ResponseEntity.noContent().build();
    }
}
