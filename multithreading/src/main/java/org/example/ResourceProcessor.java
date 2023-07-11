package org.example;

// task 2
public class ResourceProcessor {
    private final Resource resource;

    public ResourceProcessor(Resource resource) {
        this.resource = resource;
    }

    public void increase(){
        resource.setIntValue(resource.getIntValue() + 1);
    }

    public void decrease(){
        resource.setIntValue(resource.getIntValue() - 1);
    }

    public int getResource() {
        return resource.getIntValue();
    }

}
