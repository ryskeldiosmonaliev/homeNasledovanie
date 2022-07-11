package com.company;

public class Singer extends Person{
    private String bandName;
    private String singing;
    private String playGitar;

    public String getBandName() {
        return bandName;
    }

    public String getSinging() {
        return singing;
    }

    public String getPlayGitar() {
        return playGitar;
    }

    public Singer(String name, String surName, String learn, long walk, String eat, String bandName, String singing, String playGitar) {
        super(name, surName, learn, walk, eat);
        this.bandName = bandName;
        this.singing = singing;
        this.playGitar = playGitar;
    }
}
