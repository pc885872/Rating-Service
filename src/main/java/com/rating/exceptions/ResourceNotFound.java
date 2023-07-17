package com.rating.exceptions;

public class ResourceNotFound extends RuntimeException{
    public ResourceNotFound() {
        super("User Not Found");
    }
    public ResourceNotFound(String s) {
        super(s);
    }
}
