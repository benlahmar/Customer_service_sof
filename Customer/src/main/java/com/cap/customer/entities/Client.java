package com.cap.customer.entities;

import java.time.LocalDate;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.OrderColumn;

import org.springframework.data.annotation.CreatedDate;

import lombok.Data;

@Entity
@Data
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	String nom;
	
	@ElementCollection
	@OrderColumn
	String[] prenoms;
	@CreatedDate
	LocalDate date;
	
	@Embedded
	Adresse adresse;
	
	@OneToOne
	Compte compte;
	
}
