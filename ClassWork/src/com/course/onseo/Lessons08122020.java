package com.course.onseo;

import com.course.onseo.Agrigation.Car;
import com.course.onseo.Agrigation.Driver;
import com.course.onseo.Agrigation.Wheel;

public class Lessons08122020 {
    public static void main(String[] args) {

        Wheel[] wheels = new Wheel[4];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel(17, "Yota");
        }
        Car car = new Car("Zepor", wheels, "wkgkujnl2323ljbnkljb23lkn", 2.0, "Gaz");

        Driver driver = new Driver("Vasja");
        car.setDriver(driver);

        Car car2 = new Car("LUAZ", wheels, "wkgkujnl2323ljbnkljb245kn", 2.5, "Diesel");

        Driver driver = new Driver("Vasja11");
        car2.setDriver(driver);

    }
}
