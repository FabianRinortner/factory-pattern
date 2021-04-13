package com.java.avaloq;

public class Cat {

    private String name;
    private double dangerous;


    public Cat() {
        setName("Cat. Meow!");
        setDangerous(1.7);
    }

    public void displayCat() {
        System.out.println("Greetings! Im a " + getName());
    }

    public void displayDanger() {
        System.out.println(getName() + " is " + getDangerous() + " dangerous");
    }


    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public double getDangerous() {
        return dangerous;
    }

    public void setDangerous(double dangerous) {
        this.dangerous = dangerous;
    }
}
