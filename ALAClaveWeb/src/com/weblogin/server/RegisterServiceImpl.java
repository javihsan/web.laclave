package com.weblogin.server;

import java.util.EnumSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import com.google.appengine.api.users.UserServiceFactory;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.weblogin.aut.AppRole;
import com.weblogin.aut.AppUser;
import com.weblogin.aut.UserAuthentication;
import com.weblogin.aut.UserRegistry;
import com.weblogin.client.RegisterService;
import com.weblogin.shared.FieldVerifier;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class RegisterServiceImpl extends RemoteServiceServlet implements
		RegisterService {

	
	@Autowired
	private UserRegistry registry;
	
	public String register(String name, String email) throws IllegalArgumentException {

		// Verify that the input is valid.
		if (!FieldVerifier.isValidName(name)) {
			// If the input is not valid, throw an IllegalArgumentException back
			// to
			// the client.
			throw new IllegalArgumentException(
					"User must be at least 4 characters long");
		}

		// Verify that the input is valid.
		if (!FieldVerifier.isValidName(email)) {
			// If the input is not valid, throw an IllegalArgumentException back
			// to
			// the client.
			throw new IllegalArgumentException(
					"User must be at least 4 characters long");
		}
		

		 Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		    AppUser currentUser = (AppUser)authentication.getPrincipal();
		    Set<AppRole> roles = EnumSet.of(AppRole.USER);

		    if (UserServiceFactory.getUserService().isUserAdmin()) {
		        roles.add(AppRole.ADMIN);
		    }

		    AppUser user = new AppUser(currentUser.getUserId(), currentUser.getNickname(), currentUser.getEmail(),
		            "form.getForename", "form.getSurname", roles, true);

		    registry.registerUser(user);

		    // Update the context with the full authentication
		   // SecurityContextHolder.getContext().setAuthentication(new UserAuthentication(user, authentication.getDetails()));

		    return "redirect:/home.htm";
	}
	
	
	
}
