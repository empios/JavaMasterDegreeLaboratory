package com.company;

import devices.Car;

import java.util.Date;

import static java.util.Objects.isNull;

public class Human {
    private Animal pet;
    private Car car;
    private Double salary;
    private Double lastTimeSalary;
    private Date lastTimeDate;

    Human(Car car, Double salary) {
        this.salary = salary;
        this.car = car;
        checkIfICanBuyCar();
    }

    public String checkCar() {
        return car.getFullCarSpecs();
    }

    private String lastTimeSalary() {
        if(isNull(this.lastTimeDate) && isNull(this.lastTimeSalary)) {
            return "Brak zmian";
        } else {
            return "Ostatnia zmiana: " + this.lastTimeDate + " " + this.lastTimeSalary;
        }

    }

    public Double getSalary() {
        System.out.println(this.lastTimeSalary());
        return this.salary;
    }

    public void checkIfICanBuyCar() {
        Double cost = car.getCost();
        if(cost < this.salary) {
            System.out.println("Stać cię za gotówkę");
        } else if (cost/12 < this.salary) {
            System.out.println("Udało się kupić na kredyt");
        } else {
            System.out.println("Nie udało się kupić");
            this.car = null;
        }
    }

    public void setSalary(Double newSalary) {
        if(newSalary >= 0) {
            this.lastTimeSalary = this.salary;
            this.lastTimeDate = new Date();
            System.out.println("Dane wysłane do systemu księgowego");
            System.out.println("Odbierz Aneks z HR");
            System.out.println("US wszystko wie");
            this.salary = newSalary;
        } else {
            System.out.println("Ujemna wartość");
        }
    }
    public String toString() {
        return this.salary.toString();
    }
}
