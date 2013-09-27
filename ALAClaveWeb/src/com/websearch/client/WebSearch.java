package com.websearch.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.core.client.Scheduler.ScheduledCommand;
import com.google.gwt.search.client.ExpandMode;
import com.google.gwt.search.client.ResultSetSize;
import com.google.gwt.search.client.SearchControl;
import com.google.gwt.search.client.SearchControlOptions;
import com.google.gwt.user.client.ui.RootPanel;

public class WebSearch implements EntryPoint {


	/**
	 * Main entry point method.
	 */
	public void onModuleLoad() {
		// use deferred command to catch initialization exceptions in
		// onModuleLoad2
		Scheduler.get().scheduleDeferred(new ScheduledCommand() {
			public void execute() {
				onModuleLoad2();
			}
		});
	}

	public void onModuleLoad2() {
		
		SearchControlOptions options = new SearchControlOptions();
		com.google.gwt.search.client.WebSearch webSearch = new com.google.gwt.search.client.WebSearch();
		webSearch.setResultSetSize(ResultSetSize.LARGE);
		webSearch.setSiteRestriction("www.academialaclave.com");

		options.add(webSearch, ExpandMode.OPEN);
		/*
		 * ImageSearch imageSearch = new ImageSearch();
		 * imageSearch.setSiteRestriction("www.academialaclave.com");
		 * options.add(imageSearch, ExpandMode.OPEN);
		 */
		String querySearch = RootPanel.get("hiddenQuerySearch").getElement()
				.getAttribute("value");

		final SearchControl control = new SearchControl(options);
		control.execute(querySearch);

		RootPanel.get("searchClave").add(control);

	}
		
}
