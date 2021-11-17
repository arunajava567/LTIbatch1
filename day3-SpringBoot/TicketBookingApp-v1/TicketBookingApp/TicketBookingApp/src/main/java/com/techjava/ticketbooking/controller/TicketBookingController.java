package com.techjava.ticketbooking.controller;

import com.techjava.ticketbooking.model.Ticket;
import com.techjava.ticketbooking.services.TicketBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/booking")
public class TicketBookingController {

    @Autowired
    private TicketBookingService ticketBookingService;

    @GetMapping("/getAllTickets")
    public List<Ticket> getAllTickets(){
        return (List<Ticket>) ticketBookingService.getAllTickets();
    }

    @GetMapping("/getTicketById/{ticketId}")
    public Ticket getTicketById(@PathVariable Integer ticketId){
        return ticketBookingService.findTicketById(ticketId);
    }

    @GetMapping("/getTicketByEmail/{email:.+}")
    public Ticket getTicketByEmail(@PathVariable String email){
        return ticketBookingService.findTicketByEmail(email);
    }

    
    @GetMapping("/getTicketByPassenger/{pname}")
    public List<Ticket> getTicketByPassenger(@PathVariable String pname){
      
        List<Ticket> tlist=ticketBookingService.findByPassengerName(pname);
        return tlist;
    }
    @PutMapping("/updateTicketbyId/{email:.+}/ticket/{ticketId}")
    public Ticket updateTicketById(@PathVariable String email, @PathVariable Integer ticketId){
        return ticketBookingService.updateEmailById(ticketId, email);
    }
/*
 * 
 { 
     "ticketId":"101",
   "passengerName":"Abc",
   "fromStation":"Hyd",
    "toStation":"Chennai",
   "bookingDate":"2019-09-09",
     "email":"abc@gmail.com"
	
	}
 *///,consumes = "application/json", produces = "application/json"
    @PostMapping(path="/createTicket")
    public Ticket createTicket(@RequestBody Ticket ticket){
        return ticketBookingService.createTicket(ticket);
    }

    @DeleteMapping("/deleteTicketById/ticket/{ticketId}")
    public boolean deleteTicketById(@PathVariable Integer ticketId){
        return ticketBookingService.deleteTicketById(ticketId);
    }

}
