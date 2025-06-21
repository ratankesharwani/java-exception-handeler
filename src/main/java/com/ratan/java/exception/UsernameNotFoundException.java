package com.ratan.java.exception;

public class UsernameNotFoundException extends RuntimeException{
    public UsernameNotFoundException(String message) {
        super(message);
    }
}
