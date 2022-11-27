package com.example.assignment2gc200489011;


import java.util.List;

public class Make {

    private List<String> makes;

    public List<String> getMakes() {
        return makes;
    }

    public Make(List<String> makes) {
        this.makes = makes;
    }

    @Override
    public String toString() {
        return String.format(String.valueOf(getMakes()));
    }
}
