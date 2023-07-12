package org.example.task7;

import org.example.Resource;

// task 2
public class ResourceProcessor {
    private final Resource resource;

    public ResourceProcessor(Resource resource) {
        this.resource = resource;
    }

    public synchronized void increase() {
        try {
            while (resource.getIntValue() > 4) {
                wait();
            }
            resource.setIntValue(resource.getIntValue() + 1);
            System.out.println("increase: " + resource.getIntValue());
            notify();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public synchronized void decrease() {
        try {
            while (resource.getIntValue() < 1) {
                wait();
            }
            resource.setIntValue(resource.getIntValue() - 1);
            System.out.println("decrease: " + resource.getIntValue());
            notify();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }

    public int getResource() {
        return resource.getIntValue();
    }
}
