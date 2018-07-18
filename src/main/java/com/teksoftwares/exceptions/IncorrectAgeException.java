package com.mindtree.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Age is not defined connectly")
public class IncorrectAgeException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public IncorrectAgeException(String string) {
		super(string);
	}

}
