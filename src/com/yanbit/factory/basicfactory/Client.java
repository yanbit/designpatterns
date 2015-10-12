package com.yanbit.factory.basicfactory;

/**
 * Created with IntelliJ IDEA.
 * User: yanbit
 * Date: 10/10/15
 * Time: 2:33 PM
 */
public class Client {
  public static void main(String[] args){
    CarFactory carFactory = new CarFactory();
    Car car = carFactory.createCar("com.yanbit.factory.basicfactory.BSJ");
    car.run();
  }
}
