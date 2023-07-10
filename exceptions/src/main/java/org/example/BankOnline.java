package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class BankOnline {
    private static final double LIMIT = 50000.00;
    private static final ArrayList<String> BLOCKED_CARDS = new ArrayList<>(Arrays.asList("111111111111", "222222222222", "333333333333"));

    public void send(String cardNumber, Double money) throws BankOnlineException {
        if (money == null || cardNumber == null){
            throw new NullValueException("Not null value expected!");
        } else if (cardNumber.length() != 16 || !cardNumber.matches("[0-9]+")){
            throw new InvalidCardNumberException("Invalid card number! Card number have to contain 16 digits.");
        } else if (BLOCKED_CARDS.contains(cardNumber)){
            throw new BlockedCardNumberException("This card is blocked! Transfer is not available.");
        } else if (money < 0) {
            throw new NegativeTransferAmountException("A negative transfer amount has been entered!");
        } else if (money > LIMIT) {
            throw new OutOfLimitTransferException("Transfer limit exceeded!");
        }
    }
}
