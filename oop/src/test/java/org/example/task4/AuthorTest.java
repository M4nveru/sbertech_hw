package org.example.task4;

import static org.junit.Assert.*;

public class AuthorTest {
    public Author author = new Author("Nabokov", Sex.MAN, "nabokov@ya.ru");

    @org.junit.Test
    public void getName() {
        assertEquals("Nabokov", author.getName());
    }

    @org.junit.Test
    public void setName() {
        author.setName("Ahmatova");
        assertEquals("Ahmatova",author.getName());
    }

    @org.junit.Test
    public void getSex() {
        assertEquals(Sex.MAN, author.getSex());
    }

    @org.junit.Test
    public void setSex() {
        author.setSex(Sex.WOMAN);
        assertEquals(Sex.WOMAN, author.getSex());
    }

    @org.junit.Test
    public void getEmail() {
        assertEquals("nabokov@ya.ru", author.getEmail());
    }

    @org.junit.Test
    public void setEmail() {
        author.setEmail("ahmatova@bing.com");
        assertEquals("ahmatova@bing.com", author.getEmail());
    }
}