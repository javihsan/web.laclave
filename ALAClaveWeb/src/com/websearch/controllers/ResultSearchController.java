package com.websearch.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class ResultSearchController extends AbstractController {
	
	private String view;
	private String trace;
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		
		String querySearch = arg0.getParameter("querySearch");
		
		ModelAndView mav = new ModelAndView(getView());
		mav.addObject("querySearch", querySearch);
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
