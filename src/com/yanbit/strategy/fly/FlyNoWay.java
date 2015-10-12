package com.yanbit.strategy.fly;

/**
 * Created with IntelliJ IDEA.
 * User: yanbit
 * Date: 10/12/15
 * Time: 2:46 PM
 * Description:
 */
public class FlyNoWay implements FlyingStragety {
  @Override public void performFly() {
    System.out.println(" not fly,not fly,not fly");
  }
}
