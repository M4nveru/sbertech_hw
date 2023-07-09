package org.example;

import java.util.ArrayList;
import java.util.Arrays;

// part of task 3 (look /test/../ExceptionClassTest)
public class ExceptionClass {
    public int sendMoney(String cardNumber, Double money) throws NullValuesException {
        if (money == null || cardNumber == null) {
            throw new NullValuesException("Not null value expected!");
        }
        return 5;
    }
}
