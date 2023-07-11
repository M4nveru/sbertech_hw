import org.example.Increaser;
import org.example.Resource;
import org.example.ResourceProcessor;
import org.example.task7.Decreaser;
import org.junit.Test;

public class TestClass {
    private static final Resource resource = new Resource();
    private static final ResourceProcessor resourceProcessor = new ResourceProcessor(resource);
    private static final org.example.task7.ResourceProcessor resProcessor = new org.example.task7.ResourceProcessor(resource);

    // task 4,5 (task 5 -> add synchronized)
    @Test
    public void testMethod(){
        new Increaser(resourceProcessor).start();
        new Increaser(resourceProcessor).start();
        new Increaser(resourceProcessor).start();
    }

    // task 7
    @Test
    public void secondTestMethod(){
        for (int i = 0; i < 100; i++){
            new org.example.task7.Increaser(resProcessor).start();
            new Thread(new Decreaser(resProcessor)).start();
        }
    }

}
