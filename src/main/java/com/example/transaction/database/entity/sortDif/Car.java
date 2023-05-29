package com.example.transaction.database.entity.sortDif;

import lombok.Data;

//@Data
public class Car {

    private String model;
    private Integer speed;

    public Car(String model1, int speed1){
        this.model = model1;
        this.speed = speed1;
    }


    public String getModel(){
        return model;
    }

    public Integer getSpeed(){
        return speed;
    }

//    @Override
//    public int compareTo(Car car) {
//        return car.getSpeed().compareTo(speed) * -1;
//    }

//    @Override
//    public int compareTo(Car car){
//        if (car.getSpeed() > speed){
//            return 777;
//        } else if (car.speed == speed) {
//            return 0;
//        }else {
//            return -666;
//        }
//    }










//    @Override
//    public int compareTo(Car car) {
//        if (speed == car.speed){
//            return 0;
//        }
//        if (speed > car.speed){
//            return  666;
//        }
//        return -777;
//    }
}
