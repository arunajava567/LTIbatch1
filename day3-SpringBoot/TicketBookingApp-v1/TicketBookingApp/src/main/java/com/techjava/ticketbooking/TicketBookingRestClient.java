package com.techjava.ticketbooking;

import java.awt.PageAttributes.MediaType;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.techjava.ticketbooking.model.Ticket;
@RestController
public class TicketBookingRestClient {
	

	   @Autowired
	   RestTemplate restTemplate;


	public void getTicketDetails() {
		
	final String uri = "http://localhost:8085/booking/getTicketById/7";
    RestTemplate restTemplate = new RestTemplate();
    
    
    HttpHeaders headers = new HttpHeaders();
   HttpEntity <String> entity = new HttpEntity<String>(headers);
    
     ResponseEntity<Ticket> response = restTemplate.getForEntity(uri, Ticket.class);
   System.out.println(response.getBody().toString());
   // System.out.println(restTemplate.exchange(uri, HttpMethod.GET, entity, String.class).getBody().toString());
   // restTemplate.exchange("http://localhost:8085/booking/", HttpMethod.POST, entity, String.class).getBody();
   //restTemplate.exchange("http://localhost:8085/products/"+id, HttpMethod.PUT, entity, String.class).getBody();
   //restTemplate.exchange("http://localhost:8085/products/"+id, HttpMethod.DELETE, entity, String.class).getBody();
   
	}
	public static void main(String[] args) {
		TicketBookingRestClient client= new TicketBookingRestClient();
		client.getTicketDetails();
	}
}
