import example.Reflection;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

public class TestClass {

    // task 2 (io)
    private static final String ROOT_DIRECTORY = "./log";
    @Before
    public void directory(){
        File logDirectory = new File(ROOT_DIRECTORY);

        if (!logDirectory.exists()) {
            logDirectory.mkdirs();
        }
    }
    @Test
    public void createInstanceTest() throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        List<Object> objs = Reflection.createInstance(1, true, 2, "2");
        System.out.println(objs);
        Assert.assertEquals(Class.forName("org.example.example.Main$Monday"), objs.get(0).getClass());

    }

    @Test
    public void testMethod() throws ClassNotFoundException {
        Class clazz = Class.forName("example.Main$Monday");
        System.out.println(Arrays.toString(clazz.getAnnotations()));
        Assert.assertEquals("[@example.DayOfWeekAnnotation(Day=1)]", Arrays.toString(clazz.getAnnotations()));
    }

    // task 1 (io), 3, 4
    @Test
    public void callMethodsTest() throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        Reflection.callMethods(Reflection.createInstance(1, true, 2, "2"));
    }


}
