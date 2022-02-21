package com.cap.customer.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cap.customer.entities.Compte;

public interface ICompte extends JpaRepository<Compte, Long> {

	Compte findByUsernameAndPassword(String log,String pass);
}
