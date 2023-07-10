package org.example.task1;

public class Phone {
    private long number;
    private String model;
    private int weight;

    public Phone(long number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(long number, String model){
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public static void recieveCall(String name){
        System.out.printf("Звонит %s", name);
    }

    public static void recieveCall(String name, long number){
        System.out.printf("Звонит %s, номер телефона: %s", name, number);
    }

    public static void sendMessage(Long[] numbers){
        for (long num:numbers){
            System.out.println(num);
        }

    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
