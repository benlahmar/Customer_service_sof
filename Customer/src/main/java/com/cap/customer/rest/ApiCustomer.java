package com.cap.customer.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cap.customer.entities.Client;
import com.cap.customer.repo.IClient;

@RestController
public class ApiCustomer {

	@Autowired	
	IClient crepo;
	
	@GetMapping("/clients")
	public List<Client> all()
	{
		//processing 
		return crepo.findAll();
	}
	@PostMapping("/clients")
	public Client save(@RequestBody Client c)
	{
		return crepo.save(c);
	}
	
	@GetMapping("/clients/{id}")
	public ResponseEntity<Client> find(@PathVariable long id)
	{
		Optional<Client> co = crepo.findById(id);
		if(co.isPresent())
			return new ResponseEntity<>(co.get(), HttpStatus.FOUND);
		else
			return new ResponseEntity<Client>(HttpStatus.NO_CONTENT);
	}
	
}
