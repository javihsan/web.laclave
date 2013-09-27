package com.weblogin.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface LoginServiceAsync {
	void login(String user, String pass, AsyncCallback<String> callback)
			throws IllegalArgumentException;
}
