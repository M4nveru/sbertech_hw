package org.example;

public class FirstService implements Service<Long, String>{

    @Override
    public String makeRequest(Long request) {
        return "good response";
    }
}
