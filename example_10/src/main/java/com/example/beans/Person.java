package com.example.beans;

public class Person {

    public Person(){
        System.out.println("Person bean created by Spring");
    }

    private String name;
    private Vehicle vehicle;
    private String demo;
    private String demo2;


    public String getDemo() {
        return demo;
    }

    public void setDemo(String demo) {
        this.demo = demo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
