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
    public Ticket createTicket(@RequestBody Ticket ticket_28) {
        return ticketService_28.createTicket(ticket_28);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ticket> getTicketById(@PathVariable Long id_28) {
        return ticketService_28.getTicketById(id_28)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTicket(@PathVariable Long id_28) {
        ticketService_28.deleteTicket(id_28);
        return ResponseEntity.noContent().build();
    }
}