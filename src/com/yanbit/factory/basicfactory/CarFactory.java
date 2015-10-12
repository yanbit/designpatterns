package com.yanbit.factory.basicfactory;

/**
 * Created with IntelliJ IDEA.
 * User: yanbit
 * Date: 10/10/15
 * Time: 2:29 PM
 */
public class CarFactory {
  public Car createCar(String className) {
    Car car = null;
    try {
      car = (Car) Class.forName(className).newInstance();
    } catch (InstantiationException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
    return car;
  }
}
