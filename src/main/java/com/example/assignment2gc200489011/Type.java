package com.example.assignment2gc200489011;

public class Type {
    private Type[] types;

    public Type[] getTypes() {
        return types;
    }

    public Type(Type[] types) {
        this.types = types;
    }

    @Override
    public String toString() {
        return String.format(String.valueOf(getTypes()));
    }
}
