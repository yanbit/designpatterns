package com.yanbit.strategy;

import com.yanbit.strategy.fly.FlyNoWay;
import com.yanbit.strategy.quack.SmallQuack;

/**
 * Created with IntelliJ IDEA.
 * User: yanbit
 * Date: 10/12/15
 * Time: 2:47 PM
 * Description:
 */
public class RubberDuck extends Duck {
  public RubberDuck(){
    super();
    super.setFlyingStragety(new FlyNoWay());
    super.setQuackStragety(new SmallQuack());
  }
  @Override public void dispaly() {
    System.out.println(" yello duck,");
  }

}
