package com.yanbit.strategy;

/**
 * Created with IntelliJ IDEA.
 * User: yanbit
 * Date: 10/12/15
 * Time: 2:40 PM
 * Description:
 */
public class Fly {
  public static  void main(String[] args){
    System.out.println("----------start------------");
    Duck duck = null;
    duck = new RubberDuck();
    duck.dispaly();
    duck.quack();
    duck.fly();
    System.out.println("----------end------------");
  }
}
