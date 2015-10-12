package com.yanbit.singleton;

/**
 * Created with IntelliJ IDEA.
 * User: yanbit
 * Date: 10/12/15
 * Time: 10:45 AM
 */
public class ESingleton {
  //1.private ,not allow create object
  private ESingleton() {
  }

  //2.create object | static class member
  private static ESingleton instance = new ESingleton();

  //3.get instance method
  public static ESingleton getInstance(){
    return instance;
  }



}
