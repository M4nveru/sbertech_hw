package org.example.task4;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    public Book book = new Book("Lolita", new Author("Nabokov",Sex.MAN, "nabokov@ya.ru"), 1955);

    @Test
    public void getName() {
        assertEquals("Lolita", book.getName());
    }

    @Test
    public void setName() {
        book.setName("1984");
        assertEquals("1984", book.getName());
    }

    @Test
    public void getYear() {
        assertEquals(1955, book.getYear());
    }

    @Test
    public void setYear() {
        book.setYear(1984);
        assertEquals(1984, book.getYear());
    }
}