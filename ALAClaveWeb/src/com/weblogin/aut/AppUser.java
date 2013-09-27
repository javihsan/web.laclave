package com.weblogin.aut;

import java.io.Serializable;
import java.util.Set;

public class AppUser implements Serializable {

	private String userId;
	private String email;
	private String nickname;
	private String forename;
	private String surname;
	private Set<AppRole> authorities;
	private boolean enabled;
		
	
	public AppUser(String userId, String email, String nickname,
			String forename, String surname, Set<AppRole> authorities,
			boolean enabled) {
		super();
		this.userId = userId;
		this.email = email;
		this.nickname = nickname;
		this.forename = forename;
		this.surname = surname;
		this.authorities = authorities;
		this.enabled = enabled;
	}



	public String getUserId() {
		return userId;
	}

	public String getEmail() {
		return email;
	}

	public String getNickname() {
		return nickname;
	}

	public String getForename() {
		return forename;
	}

	public String getSurname() {
		return surname;
	}

	public Set<AppRole> getAuthorities() {
		return authorities;
	}

	public boolean isEnabled() {
		return enabled;
	}

}
