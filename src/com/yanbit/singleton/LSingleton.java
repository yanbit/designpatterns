package com.yanbit.singleton;

/**
 * Created with IntelliJ IDEA.
 * User: yanbit
 * Date: 10/12/15
 * Time: 10:53 AM
 */
public class LSingleton {
  private LSingleton(){
  }
  private static LSingleton instance;

  public static LSingleton getInstance(){
    if (instance == null){
      instance = new LSingleton();
    }
    return instance;
  }
}
