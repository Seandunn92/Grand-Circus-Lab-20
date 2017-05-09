package com.SeanDunn.util;

/**
 * Created by seandunn92 on 5/8/17.
 */
public class Customer {
    public String getFirstName() {
        return firstName;
    }

    public String getCoffeeChoice() {
        return coffeeChoice;
    }

    public void setCoffeeChoice(String coffeeChoice) {
        this.coffeeChoice = coffeeChoice;
    }

    private String coffeeChoice;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private String firstName;
}
