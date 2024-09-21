package com.knockknock.oop.supports.exceptions;

public class PriceZeroException extends RuntimeException{

    public PriceZeroException() {}

    public PriceZeroException(String message) {
        super(message);
    }

    public PriceZeroException(String message, Throwable cause) {
        super(message, cause);
    }
}
