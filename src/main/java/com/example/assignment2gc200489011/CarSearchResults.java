package com.example.assignment2gc200489011;

public class CarSearchResults {



    private Car[] cars;
    private String id;
    private String year;
    private String make;





    public Car[] getCars() {
        return cars;
    }

    public String getId() {
        return id;
    }

    public String getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }


    //Overridden methods
    @Override
    public String toString() {
        return String.format("ID: " + getId() + ", Year: " + getYear() + ", Make: " + getMake() + "\n");
    }
}
