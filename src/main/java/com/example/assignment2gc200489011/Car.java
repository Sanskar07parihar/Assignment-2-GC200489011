package com.example.assignment2gc200489011;

public class Car {

    //Private instance variables
    private String id;
    private String year;
    private String make;
    private String model;
    private String type;

    //Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //Constructors
    public Car(){
        this.id = "";
        this.year = "";
        this.make = "";
        this.model = "";
        this.type = "";
    }

    public Car(String id, String year, String make, String model, String type) {
        this.id = id;
        this.year = year;
        this.make = make;
        this.model = model;
        this.type = type;
    }

    //Overridden methods
    @Override
    public String toString() {
        return String.format("ID: " + getId() + ", Year: " + getYear() + ", Make: " + getMake() + ", Model: " + getModel() + ", Type: " + getType());
    }
}
