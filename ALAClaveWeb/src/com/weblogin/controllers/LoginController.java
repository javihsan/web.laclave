package com.weblogin.controllers;

import java.util.EnumSet;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.google.appengine.api.users.UserServiceFactory;
import com.weblogin.aut.AppRole;
import com.weblogin.aut.AppUser;
import com.weblogin.aut.UserAuthentication;
import com.weblogin.aut.UserRegistry;

public class LoginController extends AbstractController {
	
	private String view;
	private String trace;
	@Autowired
	private UserRegistry registry;
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		
		ModelAndView mav = new ModelAndView(getView());
		mav.addObject("trace", getTrace());
		return mav;
	}
	
	

	

	
	public String getView() {
		return view;
	}

	public void setView(String view) {
		this.view = view;
	}

	public String getTrace() {
		return trace;
	}

	public void setTrace(String trace) {
		this.trace = trace;
	}
	
}
