package org.example;

import org.junit.Test;
import org.mockito.ArgumentMatchers;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.*;

// task 1
public class FirstClassTest {

    @Test
    public void firstMethod() {
        SecondClass secondClassMock = mock(SecondClass.class);
        when(secondClassMock.secondMethod(ArgumentMatchers.anyInt()))
                .thenReturn(20);
        FirstClass firstClass = new FirstClass();

        int result = firstClass.firstMethod();

        // task 2
        verify(secondClassMock, times(3));
        assertEquals(15, result);
    }

    // task 4
    @Test
    public void privateMethodTest() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method pmethod = FirstClass.class.getDeclaredMethod("privateMethod",  int.class);
        pmethod.setAccessible(true);
        assertEquals(5,pmethod.invoke(pmethod,1));
    }
}