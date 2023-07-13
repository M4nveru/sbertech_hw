package org.example;

import com.sun.jdi.request.DuplicateRequestException;
import com.sun.jdi.request.InvalidRequestStateException;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ServiceIntegratorTest {

    @Test
    public void callTest() {
        ServiceIntegrator<String, Integer> secondService = new ServiceIntegrator<>(new SecondServiceRequestValidator(), new SecondServiceResponseValidator(), new SecondService());
        int request = secondService.call("request123");
        Assert.assertEquals(240, request);

        ServiceIntegrator<Long, String> firstService = new ServiceIntegrator<>(new FirstServiceRequestValidator(), new FirstServiceResponseValidator(), new FirstService());
        String request2 = firstService.call(123456789123L);
        Assert.assertEquals("good response",request2);

        try {
            ServiceIntegrator<Long, String> firstService2 = new ServiceIntegrator<>(new FirstServiceRequestValidator(), new FirstServiceResponseValidator(), new FirstService());
            String request3 = firstService2.call(2313214L);
            Assert.assertEquals("good response",request2);
        }
        catch (InvalidRequestStateException e){
            Assert.assertTrue(true);
        }



    }
}