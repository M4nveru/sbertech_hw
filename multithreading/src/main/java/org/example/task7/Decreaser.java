package org.example.task7;

import org.example.Resource;
import org.example.task7.ResourceProcessor;

// task 6
public class Decreaser implements Runnable {
    Resource resource = new Resource();
    ResourceProcessor resourceProcessor;

    public Decreaser(ResourceProcessor resourceProcessor) {
        this.resourceProcessor = resourceProcessor;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            resourceProcessor.decrease();
        }
    }
}
