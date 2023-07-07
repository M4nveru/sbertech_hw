package org.example;

public class StreamContainer {
    private String name;
    private Long count;

    public StreamContainer(String name, long count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCount() {
        return this.count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public void print() {
        System.out.println(this.toString());
    }

    public String toString() {
        return "StreamContainer{name='" + this.name + "', count=" + this.count + "}";
    }
}