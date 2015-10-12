package com.yanbit.strategy;

import com.yanbit.strategy.fly.FlyWithWin;

/**
 * Created with IntelliJ IDEA.
 * User: yanbit
 * Date: 10/12/15
 * Time: 2:03 PM
 * Description:
 */
public class RedheadDuck extends Duck {
  public RedheadDuck() {
    super();
    super.setFlyingStragety(new FlyWithWin());
  }

  @Override public void dispaly() {
    System.out.println("my head is red ,ga ga ga");
  }
}
