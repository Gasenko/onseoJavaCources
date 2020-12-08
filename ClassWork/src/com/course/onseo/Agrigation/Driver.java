package com.course.onseo.Agrigation;

public class Driver {
    private String name;
    private Car car;

    public Driver(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCar(Car car) {
        this.car = car;
        //this.car.setDriver(this);
    }

    public String getName() {
        return name;
    }

    public Car getCar() {
        return car;
    }
}
