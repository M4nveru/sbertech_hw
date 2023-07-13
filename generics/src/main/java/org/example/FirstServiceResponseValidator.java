package org.example;

public class FirstServiceResponseValidator implements ResponseValidator<String>{
    @Override
    public boolean isValid(String response) {
        return !response.isEmpty();
    }
}
