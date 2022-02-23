package com.cap.customer.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.security.core.userdetails.UserDetails;

import lombok.Data;

@Entity
@Data
public class Compte {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	@Column(name = "username", unique = true)
	String username;
	String password;
	
	String role;
//	@OneToOne
//	Client client;
}
