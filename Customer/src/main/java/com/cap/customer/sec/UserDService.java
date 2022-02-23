package com.cap.customer.sec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cap.customer.entities.Compte;
import com.cap.customer.repo.ICompte;

@Service
public class UserDService implements UserDetailsService {

	@Autowired
	ICompte crepo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Compte c = crepo.findByUsername(username);
		DetailsUser d=new DetailsUser(c);
		return d;
	}

}
