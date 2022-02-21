package com.cap.customer.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Compte {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	String username,password;
	
	String role;
	@OneToOne
	Client client;
}
