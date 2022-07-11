package com.company;

public class Person {
    private String name;
    private String surName;
    private String learn;
    private long walk;
    private String eat;

    public Person(String name, String surName, String learn, long walk, String eat) {
        this.name = name;
        this.surName = surName;
        this.learn = learn;
        this.walk = walk;
        this.eat = eat;

    }

    @Override
    public String toString() {
        return "name-> "+name+" "+"surName->  "+" "+surName+" "+"Что изучаеть? Ответ-> "+learn+" "+"Сколко шагов в день? Ответ-> "+walk+" "+"Какое блюдо эл на обед-> "+eat;
    }
}
