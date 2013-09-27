package com.weblogin.aut;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import com.google.appengine.api.users.UserServiceFactory;


public class AccountsAuthenticationEntryPoint implements
		AuthenticationEntryPoint {
	
	public void commence(HttpServletRequest request,
			HttpServletResponse response, AuthenticationException authException)
			throws IOException, ServletException {
		
		String redirectURL = UserServiceFactory.getUserService().createLoginURL(request.getRequestURI());

		response.sendRedirect(redirectURL);

	}
	
}
