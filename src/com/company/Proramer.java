package com.company;

public class Proramer extends Person {
    private String componyName;
    private String coding;

    public String getComponyName() {
        return componyName;
    }

    public String getCoding() {
        return coding;
    }

    public Proramer(String name, String surName, String learn, long walk, String eat, String componyName, String coding) {
        super(name, surName, learn, walk, eat);
        this.componyName = componyName;
        this.coding = coding;
    }


}

