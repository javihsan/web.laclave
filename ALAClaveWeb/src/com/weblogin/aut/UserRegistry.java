package com.weblogin.aut;

import com.weblogin.aut.AppUser;

public interface UserRegistry {
	AppUser findUser(String userId);

	void registerUser(AppUser newUser);

	void removeUser(String userId);
}
