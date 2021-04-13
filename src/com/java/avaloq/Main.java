package com.java.avaloq;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CatFactory catFactory= new CatFactory();
        Cat cat;

        Scanner userInput = new Scanner(System.in);
        System.out.print("Cat or Tiger? ");

        if (userInput.hasNextLine()) {
            String catType = userInput.nextLine();
            cat = catFactory.manufactureCat(catType);

            if (cat != null) {
                cat.displayCat();
                cat.displayDanger();
            } else {
                System.out.print("Please enter Cat or Tiger.");
            }
        }
    }
}
