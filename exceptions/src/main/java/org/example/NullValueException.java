package org.example;

public class NullValueException extends BankOnlineException{
    public NullValueException() {
    }

    public NullValueException(String message) {
        super(message);
    }
}
