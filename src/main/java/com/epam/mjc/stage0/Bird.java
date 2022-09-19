package com.epam.mjc.stage0;

public class Bird extends Animal {
    public Bird() {
        super("blue", 2, false);
    }

    @Override
    public String getDescription() {
        String fur = "no";
        if (hasFur) {
            fur = "a";
        }
        String paw = "paw";
        if (numberOfPaws > 1) {
            paw = "paws";
        }
        return "This animal is mostly " + color + ". It has "
                + numberOfPaws + " " + paw + " and " + fur + " fur." + " Moreover, it has 2 wings and can fly.";
    }
}