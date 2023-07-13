package org.example;

public class SecondServiceResponseValidator implements ResponseValidator<Integer>{
    @Override
    public boolean isValid(Integer response) {
        return response!=408;
    }
}
