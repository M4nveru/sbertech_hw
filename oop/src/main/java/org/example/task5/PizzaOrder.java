package org.example.task5;

public class PizzaOrder {
    private String name;
    private Size size = null;
    private boolean sauceNeeded;
    private String address;
    private boolean orderAccessed;

    public PizzaOrder(String name, Size size, boolean sauceNeeded, String address) {
        this.name = name;
        this.size = size;
        this.sauceNeeded = sauceNeeded;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public boolean isSauceNeeded() {
        return sauceNeeded;
    }

    public void setSauceNeeded(boolean sauceNeeded) {
        this.sauceNeeded = sauceNeeded;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void order(){
        if (orderAccessed){
            System.out.println("Заказ уже принят!");
        }
        else{
            this.orderAccessed = true;
            System.out.print("Заказ принят. ");
            switch (size) {
                case SMALL -> System.out.print("Маленькая пицца ");
                case MEDIUM -> System.out.print("Средняя пицца ");
                case BIG -> System.out.print("Большая пицца ");
            }
            System.out.print("«"+name+"» ");
            if (sauceNeeded){
                System.out.print("с соусом ");
            }
            else System.out.print("без соуса ");
            System.out.print("на адрес " + address + ".");
        }
    }

    public void cancel(){
        this.orderAccessed = false;
        System.out.println("Заказ не был принят.");
    }

    @Override
    public String toString() {
        return "PizzaOrder{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", sauceNeeded=" + sauceNeeded +
                ", address='" + address + '\'' +
                ", orderAccessed=" + orderAccessed +
                '}';
    }
}
enum Size {
    SMALL,
    MEDIUM,
    BIG
}

