package com.shreyas.car;

public class CarService {
    private final CarDao carDao  = new CarDao();

    public Car[] getCars() {
        return carDao.getCar();
    }

    public Car getCarByReg(String reg) {
        for (Car car : getCars()) {
            if (car.getRegNum().equals(reg)) {
                return car;
            }
        }
        throw new IllegalStateException(String.format("Car with %s registration number doesnt exist", reg));
    }
}
