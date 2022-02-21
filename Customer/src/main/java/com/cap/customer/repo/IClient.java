package com.cap.customer.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cap.customer.entities.Client;


public interface IClient  extends JpaRepository<Client, Long>{

	public List<Client> findByNomLike(String n);
	//public List<Client> findByAdressVille(String v);
	public List<Client> findByDateBetween(LocalDate dd, LocalDate df);
	public Client findByCompteUsername(String log);
	
	@Query("from Client c where c.nom=?1")
	public List<Client> getbynom(String nom);
}
