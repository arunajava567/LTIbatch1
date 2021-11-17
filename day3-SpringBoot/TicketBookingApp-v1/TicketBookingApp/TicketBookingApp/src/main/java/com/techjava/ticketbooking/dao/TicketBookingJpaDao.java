package com.techjava.ticketbooking.dao;

import com.techjava.ticketbooking.model.Ticket;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketBookingJpaDao extends JpaRepository<Ticket,Integer>{
    @Query("select t from Ticket t where t.email=:email")
    Ticket findByEmail( String email);
    
    
    @Query("select t from Ticket t where t.passengerName=:pname")
    List<Ticket> findByPassengerName(String pname);

}
