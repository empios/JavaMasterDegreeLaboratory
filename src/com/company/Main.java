package com.company;

import devices.Car;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("canis", "Szarik");
        System.out.println("pies nazywa się " + dog.name);

        System.out.println("zwierze waży " + dog.getWeight());
        System.out.println(dog.species);
        dog.feed();
        dog.feed();
        dog.feed();
        dog.feed();
        dog.feed();
        dog.feed();
        dog.takeForWalk();
        dog.takeForWalk();
        System.out.println("pies waży " + dog.getWeight());


        Human pawel = new Human(new Car("2020"), 1500.0);
        String carResult = pawel.checkCar();
        System.out.println(carResult);
        System.out.println(pawel.getSalary());
        pawel.setSalary(1700.0);
        System.out.println(pawel.getSalary());
        pawel.checkIfICanBuyCar();
        pawel.setSalary(2600.0);
        pawel.checkIfICanBuyCar();
        Human pawel2 = new Human(new Car("2020"), 1500.0);
        System.out.println(pawel);
        System.out.println(pawel2);
    }
}