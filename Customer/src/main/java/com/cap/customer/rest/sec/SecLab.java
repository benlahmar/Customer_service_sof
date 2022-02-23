package com.cap.customer.rest.sec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cap.customer.entities.Client;
import com.cap.customer.entities.Compte;
import com.cap.customer.repo.IClient;
import com.cap.customer.repo.ICompte;

import org.springframework.security.crypto.bcrypt.*;


@RestController
public class SecLab {

	@Autowired
	ICompte crepo;
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@PostMapping("/comptes1")
	public Compte save(@RequestBody Compte c)
	{
		c.setPassword(bCryptPasswordEncoder.encode(c.getPassword()));
		c=crepo.save(c);
		return c;
	}
	@GetMapping("/comptes/{id}")
	public Compte getclientinfo(@PathVariable long id)
	{
		Compte c = crepo.findById(id).get();
		return c;
		
	}
}
