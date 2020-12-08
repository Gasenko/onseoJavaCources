package com.course.onseo.Agrigation;

public class Engine {
    private String serialNumber;
    private double value;
    private String type;

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getValue() {
        return value;
    }

    public String getType() {
        return type;
    }

    public Engine(String serialNumber, double value, String type) {
        this.serialNumber = serialNumber;
        this.value = value;
        this.type = type;
    }
}
