package com.example.nnpia_cv_2;

public class Person {
    int ID;
    String name;
    int age;

    public Person(int ID, String name, int age) {
        this.ID = ID;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return ID + " " + name + " " + age;
    }
}
