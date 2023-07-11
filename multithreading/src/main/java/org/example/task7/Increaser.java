package org.example.task7;

import org.example.Resource;
import org.example.task7.ResourceProcessor;

// class for task 7
public class Increaser extends Thread{
    ResourceProcessor resourceProcessor;

    public Increaser(ResourceProcessor resourceProcessor) {
        this.resourceProcessor = resourceProcessor;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            resourceProcessor.increase();
        }
    }
}
