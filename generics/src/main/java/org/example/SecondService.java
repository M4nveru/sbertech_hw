package org.example;

public class SecondService implements Service<String, Integer> {

    @Override
    public Integer makeRequest(String request) {
        return request.length()*24;
    }
}
