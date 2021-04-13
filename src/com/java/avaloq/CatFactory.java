package com.java.avaloq;

public class CatFactory {

    public Cat manufactureCat(String catType) {

        if (catType.equals("Cat")) {
            return new Cat();

        } else if (catType.equals("Tiger")) {
            return new Tiger();

        } else return null;
    }
}
