package org.example;

public interface RequestValidator <Q> {
    boolean isValid(Q request);
}
