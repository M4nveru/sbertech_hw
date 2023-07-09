package org.example;

// part of task 1 (look /test../FirstClassTest)
public class SecondClass {
    public int b;

    public SecondClass() {
        this.b = 0;
    }

    public int secondMethod(int value) {
        this.b = value * 2;
        int result = value * 10;
        return result;
    }
}
