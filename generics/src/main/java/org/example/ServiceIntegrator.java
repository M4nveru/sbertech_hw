package org.example;

import com.sun.jdi.request.InvalidRequestStateException;

import java.rmi.AccessException;

public class ServiceIntegrator<Q, S> {
    private final RequestValidator<Q> requestValidator;
    private final ResponseValidator<S> responseValidator;
    private final Service<Q,S> service;

    public ServiceIntegrator(RequestValidator<Q> requestValidator, ResponseValidator<S> responseValidator, Service<Q, S> service) {
        this.requestValidator = requestValidator;
        this.responseValidator = responseValidator;
        this.service = service;
    }

    public S call(Q request){
        if (!requestValidator.isValid(request)) throw new InvalidRequestStateException();

        S response = service.makeRequest(request);

        if(!responseValidator.isValid(response)) throw new RuntimeException("Bad response!");

        return response;
    }
}
