package org.example;

// part of task 3 (look /test/../ExceptionClassTest)
public class NullValuesException extends Exception{
    public NullValuesException() {
    }

    public NullValuesException(String message) {
        super(message);
    }
}

