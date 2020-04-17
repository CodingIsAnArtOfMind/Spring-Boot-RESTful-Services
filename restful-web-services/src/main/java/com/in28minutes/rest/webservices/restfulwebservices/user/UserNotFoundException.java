package com.in28minutes.rest.webservices.restfulwebservices.user;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {

	/**
	 * 
	 */

	public UserNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
