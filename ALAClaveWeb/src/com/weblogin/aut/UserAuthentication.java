package com.weblogin.aut;

import java.util.Collection;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

public class UserAuthentication implements Authentication {

	private String name;
	private Collection<GrantedAuthority> authorities;
	private Object credentials;
	private Object details;
	private Object principal;
	private boolean authenticated;
		
	public UserAuthentication(String name,
			Collection<GrantedAuthority> authorities, Object credentials,
			Object details, Object principal, boolean authenticated) {
		super();
		this.name = name;
		this.authorities = authorities;
		this.credentials = credentials;
		this.details = details;
		this.principal = principal;
		this.authenticated = authenticated;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<GrantedAuthority> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(Collection<GrantedAuthority> authorities) {
		this.authorities = authorities;
	}

	public Object getCredentials() {
		return credentials;
	}

	public void setCredentials(Object credentials) {
		this.credentials = credentials;
	}

	public Object getDetails() {
		return details;
	}

	public void setDetails(Object details) {
		this.details = details;
	}

	public Object getPrincipal() {
		return principal;
	}

	public void setPrincipal(Object principal) {
		this.principal = principal;
	}

	public boolean isAuthenticated() {
		return authenticated;
	}

	public void setAuthenticated(boolean authenticated) {
		this.authenticated = authenticated;
	}
	
	

}
