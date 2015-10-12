package com.yanbit.strategy;

import com.yanbit.strategy.fly.FlyWithRocket;
import com.yanbit.strategy.quack.BigQuack;

/**
 * Created with IntelliJ IDEA.
 * User: yanbit
 * Date: 10/12/15
 * Time: 3:04 PM
 * Description:
 */
public class SpaceDuck extends Duck {

  public SpaceDuck(){
    super();
    super.setFlyingStragety(new FlyWithRocket());
    super.setQuackStragety(new BigQuack());
  }
  @Override public void dispaly() {
    System.out.println(" head !!!");
  }
}
