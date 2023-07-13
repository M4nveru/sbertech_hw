package org.example;

public interface Service<Q,S> {
    S makeRequest(Q request);
}
