import org.example.example.Main;
import org.example.example.Reflection;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

public class TestClass {
    // task 1
    @Test
    public void createInstanceTest() throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        List<Object> objs = Reflection.createInstance(1, true, 2, "2");
        System.out.println(objs);
        Assert.assertEquals(Class.forName("org.example.example.Main$Monday"), objs.get(0).getClass());

    }

    @Test
    public void testMethod() throws ClassNotFoundException {
        Class clazz = Class.forName("org.example.example.Main$Monday");
        System.out.println(Arrays.toString(clazz.getAnnotations()));
        Assert.assertEquals("[@org.example.example.DayOfWeekAnnotation(Day=1)]", Arrays.toString(clazz.getAnnotations()));
    }

    // task 2,3
    @Test
    public void callMethodsTest() throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        Reflection.callMethods(Reflection.createInstance(1, true, 2, "2"));
    }


}
