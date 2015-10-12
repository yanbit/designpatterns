package com.yanbit.strategy.fly;

/**
 * Created with IntelliJ IDEA.
 * User: yanbit
 * Date: 10/12/15
 * Time: 3:03 PM
 * Description:
 */
public class FlyWithRocket implements FlyingStragety {
  @Override public void performFly() {
    System.out.println(" fly with rocket!!!");
  }
}
