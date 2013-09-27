package com.weblogin.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("srvLogin")
public interface LoginService extends RemoteService {
	String login(String user, String pass) throws IllegalArgumentException;
}
