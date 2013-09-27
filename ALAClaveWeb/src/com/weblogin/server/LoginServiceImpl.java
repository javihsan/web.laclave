package com.weblogin.server;

import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.weblogin.client.LoginService;
import com.weblogin.shared.FieldVerifier;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class LoginServiceImpl extends RemoteServiceServlet implements
		LoginService {

	public String login(String user, String pass) throws IllegalArgumentException {

		// Verify that the input is valid.
		if (!FieldVerifier.isValidName(user)) {
			// If the input is not valid, throw an IllegalArgumentException back
			// to
			// the client.
			throw new IllegalArgumentException(
					"User must be at least 4 characters long");
		}

		// Verify that the input is valid.
		if (!FieldVerifier.isValidName(pass)) {
			// If the input is not valid, throw an IllegalArgumentException back
			// to
			// the client.
			throw new IllegalArgumentException(
					"User must be at least 4 characters long");
		}
		

		UserService userService = UserServiceFactory.getUserService();
		
		String thisURL = getThreadLocalRequest().getRequestURI();
		if (getThreadLocalRequest().getUserPrincipal() != null 
				&& userService.getCurrentUser()!=null){
			String g = "";
		} 
		userService.createLoginURL(thisURL);
		
		
		return "Hello, " + user;
	}
	
	
	
	
}
