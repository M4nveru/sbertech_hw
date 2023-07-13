package org.example;

public class SecondServiceRequestValidator implements RequestValidator<String>{
    @Override
    public boolean isValid(String request) {
        return !request.isEmpty();
    }
}
