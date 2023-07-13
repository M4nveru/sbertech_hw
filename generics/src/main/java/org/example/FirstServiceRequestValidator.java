package org.example;

import java.net.URL;

public class FirstServiceRequestValidator implements RequestValidator<Long>{
    @Override
    public boolean isValid(Long request) {
        String req = request.toString();
        return req.length() == 12;
    }
}
