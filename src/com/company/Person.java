package com.company;

public class Person {

    String name;
    int age;

    public Person(String name, int age) {


    }

    public Person() {
        
    }

    public void setName() {
        this.name = name;
    }

    public void setAge() {
        this.age = age;
    }
    @Override
    public String toString() {

        return this.name + this.age;
    }

}
