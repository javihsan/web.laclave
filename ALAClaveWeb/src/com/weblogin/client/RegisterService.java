package com.weblogin.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("srvLogin")
public interface RegisterService extends RemoteService {
	String register(String name, String email) throws IllegalArgumentException;
}
