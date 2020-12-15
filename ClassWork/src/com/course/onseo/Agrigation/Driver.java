package com.course.onseo.Agrigation;

public class Driver {
    private String name;
    private Car car;
    private boolean isCarSettled;

    public Driver(String name) {
        this.name = name;
        isCarSettled = false;
    }

    public String getName() {
        return name;
    }

    public void setCar(Car car) {
        if(car.getDriver() != this) {
            dismissDriver();
        }else {
            isCarSettled = true;
            this.car = car;
            car.setDriver(this);
        }
    }

    public Car getCar() {
        return car;
    }

    private void dismissDriver(){
        this.getCar().setDriver(null);
        this.setCar(null);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", car=" + car +
                '}';
    }
}


/*package com.course.onseo.Agrigation;

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
*/