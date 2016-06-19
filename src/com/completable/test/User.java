package com.completable.test;

import java.util.function.Supplier;

public class User {

	/*public Supplier<User> loadUser(String uuid) {
		return new Supplier<User>() {

			@Override
			public User get() {
				return new User();
			}
		};
	}*/
	
	public User loadUser(String uuid) {
		return new User();
	}
}
