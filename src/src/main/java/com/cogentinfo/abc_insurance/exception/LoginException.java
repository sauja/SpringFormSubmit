package com.cogentinfo.abc_insurance.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class LoginException extends RuntimeException {
    public LoginException(String message, Throwable cause) {
        super(message, cause);
    }

    public LoginException(String message) {
        super(message);
    }
}



