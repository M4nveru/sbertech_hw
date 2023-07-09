package org.example;
import org.example.BankOnline;

// part of task 1, 2 (look /test../FirstClassTest)
public class FirstClass {
    private int a;

    public FirstClass() {
        this.a = 0;
    }

    public int firstMethod() {
        this.a += 1;
        SecondClass secondClass = new SecondClass();
        int result = secondClass.secondMethod(this.a);
        secondClass.secondMethod(10);
        secondClass.secondMethod(2);
        return result;
    }

    // part of task 4 (look /test../FirstClassTest)
    private static int privateMethod(int i){
        return i*5;
    }
}
