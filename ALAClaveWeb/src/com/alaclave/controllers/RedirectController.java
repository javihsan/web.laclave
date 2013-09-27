package com.alaclave.controllers;

import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class RedirectController extends AbstractController {
	
	private Map traceMap;
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		
		String requestUri = arg0.getRequestURI();
		String trace = "main";
				
		Set setKeys = getTraceMap().keySet();
		for (Object key : setKeys) {
			if (requestUri.toLowerCase().indexOf((String)key)!=-1){
				trace = (String)getTraceMap().get(key);
			}
		}
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("trace", trace);
		
		return mav;
	}
	
	public Map getTraceMap() {
		return traceMap;
	}

	public void setTraceMap(Map traceMap) {
		this.traceMap = traceMap;
	}
	
}
