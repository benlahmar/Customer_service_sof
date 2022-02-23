package com.cap.customer.sec;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.cap.customer.entities.Compte;

public class DetailsUser  extends Compte implements UserDetails{

	
	
	public DetailsUser() {
		super();
		// TODO Auto-generated constructor stub
	}



	public DetailsUser(Compte c) {
		
		this.setId(c.getId());
		this.setUsername(c.getUsername());
		this.setPassword(c.getPassword());
		this.setRole(c.getRole());
	}
	
	

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Collection< GrantedAuthority> gs=new ArrayList<>();
		
		GrantedAuthority g=new SimpleGrantedAuthority(this.getRole());
		gs.add(g);
		return gs;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return this.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return this.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
