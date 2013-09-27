package com.alaclave.client;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.core.client.Scheduler.ScheduledCommand;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.RootPanel;

public class Main implements EntryPoint {

	/**
	 * Main entry point method.
	 */
	public void onModuleLoad() {
		
		// set uncaught exception handler
		Log.setUncaughtExceptionHandler();

		// use deferred command to catch initialization exceptions in
		// onModuleLoad2
		Scheduler.get().scheduleDeferred(new ScheduledCommand() {
			public void execute() {
				onModuleLoad2();
			}
		});
	}

	public void onModuleLoad2() {

		if (Log.isLoggingEnabled()) {
			Window.alert("Logging is enabled in ALClave!!");
		}

		//openPub();

	}

	public void openPub() {
		
		final PopupPubli popup = new PopupPubli();

		popup.setPopupPositionAndShow(new PopupPanel.PositionCallback() {
			public void setPosition(int offsetWidth, int offsetHeight) {
				int left = (Window.getClientWidth() - offsetWidth) / 3;
				popup.setPopupPosition(left, 0);
			}
		});

		Timer t = new Timer() {
			public void run() {
				popup.hide();
			}
		};
		t.schedule(12 * 1000);

	}

}
