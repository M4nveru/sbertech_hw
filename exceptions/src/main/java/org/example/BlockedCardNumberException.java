package org.example;

public class BlockedCardNumberException extends  BankOnlineException{
    public BlockedCardNumberException() {
    }

    public BlockedCardNumberException(String message) {
        super(message);
    }
}
