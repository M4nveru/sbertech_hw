package org.example;

public class InvalidCardNumberException extends BankOnlineException{
    public InvalidCardNumberException() {
    }

    public InvalidCardNumberException(String message) {
        super(message);
    }
}
