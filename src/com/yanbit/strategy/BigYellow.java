package com.yanbit.strategy;

import com.yanbit.strategy.fly.FlyNoWay;

/**
 * Created with IntelliJ IDEA.
 * User: yanbit
 * Date: 10/12/15
 * Time: 2:49 PM
 * Description:
 */
public class BigYellow extends Duck {
  public BigYellow(){
    super();
    super.setFlyingStragety(new FlyNoWay());
  }
  @Override public void dispaly() {
    System.out.println(" big duck ,yellow ,yellow");
  }

  @Override public void quack() {

  }
}
