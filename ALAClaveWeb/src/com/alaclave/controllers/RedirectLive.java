package com.alaclave.controllers;

import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class RedirectLive extends AbstractController {
	
	private Map redirectMap;
	private String view;
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		
		String requestUri = arg0.getRequestURI();
		String viewParam = "main";
				
		Set setKeys = getRedirectMap().keySet();
		for (Object key : setKeys) {
			if (requestUri.toLowerCase().indexOf((String)key)!=-1){
				viewParam = (String)getRedirectMap().get(key);
			}
		}
		
		ModelAndView mav = new ModelAndView(view);
		mav.addObject("viewParam", viewParam);
		
		return mav;
	}
	
	public Map getRedirectMap() {
		return redirectMap;
	}

	public void setRedirectMap(Map redirectMap) {
		this.redirectMap = redirectMap;
	}
	
	public String getView() {
		return view;
	}

	public void setView(String view) {
		this.view = view;
	}
	
}
