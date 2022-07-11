package com.company;

public class Danser extends Person{
    private String groupName;
    private String dansing;

    public String getGroupName() {
        return groupName;
    }

    public String getDansing() {
        return dansing;
    }

    public Danser(String name, String surName, String learn, long walk, String eat, String groupName, String dansing) {
        super(name, surName, learn, walk, eat);
        this.groupName = groupName;
        this.dansing = dansing;
    }

}
