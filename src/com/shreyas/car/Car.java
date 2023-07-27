package com.shreyas.car;

import java.util.Objects;

//Car POJO

public class Car {
    private String regNum;
    private String brand;
    private boolean isElectric;

    public Car() {

    }
    public Car(String regNum, String brand, boolean isElectric) {
        this.regNum = regNum;
        this.brand = brand;
        this.isElectric = isElectric;
    }

    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    @Override
    public String toString() {
        return "Car{" +
                "regNum='" + regNum + '\'' +
                ", brand='" + brand + '\'' +
                ", isElectric=" + isElectric +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return isElectric == car.isElectric && Objects.equals(regNum, car.regNum) && Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNum, brand, isElectric);
    }
}
