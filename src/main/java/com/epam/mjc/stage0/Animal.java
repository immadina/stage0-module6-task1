package com.epam.mjc.stage0;

public class Animal {

    //Provide it with 3 private fields - color(String), numberOfPaws(int), hasFur(boolean).
    String color = "Black";
    int numberOfPaws = 4;
    boolean hasFur = true;

    //Add constructor with full parameters. Save the parameter order and names as it is listed in a second paragraph.
    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    //Add a methods getDescription(), witch would use class fields and return a string with such pattern
    // "This animal is mostly (color). It has (numberOfPaws) paws and ('a'/'no' -> depends on value of hasFur) fur."
    public String getDescription() {
        String fur = "no";
        if (hasFur) {
            fur = "a";
        }
        String paw = "paw";
        if (numberOfPaws > 1) {
            paw = "paws";
        }
        return "This animal is mostly " + color + ". It has " + numberOfPaws + " " + paw + " and " + fur + " fur.";
    }
}