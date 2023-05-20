package com.serenitydojo;

public abstract class Pet {
    private String name;
    private int age;

    Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
    public abstract String play();

}