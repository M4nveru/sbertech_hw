package org.example;

// task 6
public class Decreaser implements Runnable {
    Resource resource = new Resource();
    ResourceProcessor resourceProcessor = new ResourceProcessor(resource);

    @Override
    public void run() {
        resourceProcessor.decrease();
    }
}
