package com.example.smarttransit.controller;

import com.example.smarttransit.model.Ticket;
import com.example.smarttransit.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/counter")
public class TicketController {

    @Autowired
    private TicketRepository ticketRepository;

    @PostMapping
    public ResponseEntity<?> createTicket(@RequestBody Ticket ticket) {
        try {
            Ticket savedTicket = ticketRepository.save(ticket);
            return ResponseEntity.ok().body(savedTicket.getId());
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body("Error creating ticket");
        }
    }
}
