package com.example.CommandLineAppExercise.model;

public class Person {

    private String name;
    private String telephone;

    public Person() {

    }

    public Person(String name, String telephone) {
        this.name = name;
        this.telephone = telephone;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }


}
