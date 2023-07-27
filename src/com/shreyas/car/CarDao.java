package com.shreyas.car;

public class CarDao {
    private static final Car[] cars;

    static  {
        cars = new Car[] {
                new Car("123", "Range Rover", false),
                new Car("456", "Tesla X", true),
                new Car("789", "BMW M8 Coupe", false)
        };
    }

    public Car[] getCar() {
        return cars;
    }
}
