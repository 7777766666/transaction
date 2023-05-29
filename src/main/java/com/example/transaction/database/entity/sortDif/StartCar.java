package com.example.transaction.database.entity.sortDif;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StartCar {

    public static void main(String[] args) {
        System.out.println("!!!!!!!!!!!!!!!!");

        System.out.println(Lol.class);
        System.out.println(Sort.class);

        Car car = new Car("Tasla", 202);
        Car car1 = new Car("Kamaz", 110);
        Car car2 = new Car("Lamba", 300);
        Car car4 = new Car("Ferr", 300);
        Car car3 = new Car("Toy", 12);

        List<Car> cars = new ArrayList<>();
        cars.addAll(List.of(car1, car2, car3, car, car4));
        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car car10, Car car50) {
                int compareTo = car10.getSpeed().compareTo(car50.getSpeed());
                if (compareTo == 0){
                    car10.getModel().compareTo(car50.getModel());
                }
                return compareTo;
            }
        });
        for (Car xxx: cars){
            System.out.println(xxx.getModel() + " " +  xxx.getSpeed() + " ");

        }


    }

}
