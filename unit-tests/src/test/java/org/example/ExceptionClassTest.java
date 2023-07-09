package org.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

// task 3
public class ExceptionClassTest {

    @Test(expected = NullValuesException.class)
    public void sendMoney() throws NullValuesException {
        ExceptionClass exceptionClass = new ExceptionClass();
        int value = exceptionClass.sendMoney("1111222233334444", null);
        Assert.assertEquals(5,value);
    }
}