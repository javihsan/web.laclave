package com.weblogin.aut;

import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.authentication.preauth.PreAuthenticatedAuthenticationToken;

import com.google.appengine.api.users.User;

public class AccountsAuthenticationProvider implements AuthenticationProvider {
	private UserRegistry userRegistry;
	private List usersAuthenticated;

	public Authentication authenticate(Authentication authentication)
			throws AuthenticationException {

		User googleUser = (User) authentication.getPrincipal();

		// Nos aseguramos que el usuario esté registrado
		AppUser user = userRegistry.findUser(googleUser.getUserId());
		
		// SOLO PARA CREAR USUARIOS, LUEGO DESHABILITAR
		
		if (user == null) {
					
			 // Usuario no registado. Lo registramos si cumple con la  seguridad 
			 if  (getUsersAuthenticated().contains(googleUser.getEmail())) {
			  
			 	Set<AppRole> roles = EnumSet.of(AppRole.ADMIN);
			  
			  	user = new AppUser(googleUser.getUserId(),
			  	googleUser.getNickname(), googleUser.getEmail(), "", "", roles, true);
			  
			  	userRegistry.registerUser(user); 
			 }
		}

		if (user != null && user.isEnabled()) {
			// Traspasamos la información de user a userAuthentication, 
			// que es  la verdadera Authentication
			Collection<GrantedAuthority> roles = new HashSet<GrantedAuthority>();
			Set<AppRole> rolesUser = user.getAuthorities();
			for (AppRole r : rolesUser) {
				roles.add(r);
			}

			UserAuthentication userAuthentication = new UserAuthentication(
					authentication.getName(), roles,
					authentication.getCredentials(),
					authentication.getDetails(), user, true);

			return userAuthentication;

		} else {
			throw new DisabledException("Account is disabled.");
		}

	}

	public final boolean supports(Class<?> authentication) {
		return PreAuthenticatedAuthenticationToken.class
				.isAssignableFrom(authentication);
	}

	public void setUserRegistry(UserRegistry userRegistry) {
		this.userRegistry = userRegistry;
	}

	public List getUsersAuthenticated() {
		return usersAuthenticated;
	}

	public void setUsersAuthenticated(List usersAuthenticated) {
		this.usersAuthenticated = usersAuthenticated;
	}
}
