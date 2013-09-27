package com.weblogin.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface RegisterServiceAsync {
	void register(String name, String email, AsyncCallback<String> callback)
			throws IllegalArgumentException;
}
