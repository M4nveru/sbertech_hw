package org.example;

// part of task 3
public class NullValueException extends BankOnlineException{
    public NullValueException() {
    }

    public NullValueException(String message) {
        super(message);
    }
}
