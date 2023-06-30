package org.example.task5;

import org.junit.Test;

import static org.junit.Assert.*;

public class PizzaOrderTest {
    PizzaOrder order = new PizzaOrder("Аль Капчоне", Size.BIG, true, "Мира, д.1");

    @Test
    public void getName() {
        assertEquals("Аль Капчоне", order.getName());
    }

    @Test
    public void setName() {
        order.setName("4 сыра");
        assertEquals("4 сыра", order.getName());
    }

    @Test
    public void getSize() {
        assertEquals(Size.BIG, order.getSize());
    }

    @Test
    public void setSize() {
        order.setSize(Size.SMALL);
        assertEquals(Size.SMALL, order.getSize());
    }

    @Test
    public void isSauceNeeded() {
        assertEquals(true, order.isSauceNeeded());
    }

    @Test
    public void setSauceNeeded() {
        order.setSauceNeeded(false);
        assertFalse(order.isSauceNeeded());
    }

    @Test
    public void getAddress() {
        assertEquals("Мира, д.1", order.getAddress());
    }

    @Test
    public void setAddress() {
        order.setAddress("Мира, д.2");
        assertEquals("Мира, д.2", order.getAddress());
    }
}