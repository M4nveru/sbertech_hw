package org.example;

// task 3
public class Increaser extends Thread{
    private final ResourceProcessor resourceProcessor;

    public Increaser(ResourceProcessor resourceProcessor) {
        this.resourceProcessor = resourceProcessor;
    }

    @Override
    public void run() {
        // task 5 - add synchronized
        synchronized (resourceProcessor) {
            for (int i = 0; i < 6; i++) {
                resourceProcessor.increase();
                System.out.println(resourceProcessor.getResource());
            }
        }
    }
}
