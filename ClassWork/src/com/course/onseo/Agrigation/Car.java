package com.course.onseo.Agrigation;

import java.sql.Driver;

public class Car {
    private String model;

    private Driver driver; //association
    private Wheel[] wheel;//aggregation

    private Engine engine;

    public Car(String model, Wheel[] wheel, String engineSerialNumber, double engineVolume, String engineType) {
        this.model = model;
        this.wheel = wheel;
        this.engine = new Engine(engineSerialNumber, engineVolume, engineType);
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
        //this.driver.setCar(this);
    }

    public Wheel[] getWheel() {
        return wheel;
    }

    public void setWheel(Wheel[] wheel) {
        this.wheel = wheel;
    }

}
