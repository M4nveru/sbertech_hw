package org.example;

public interface ResponseValidator<S>{
    boolean isValid(S response);
}
