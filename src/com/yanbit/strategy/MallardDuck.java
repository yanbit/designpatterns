package com.yanbit.strategy;

import com.yanbit.strategy.fly.FlyWithWin;
import com.yanbit.strategy.quack.BigQuack;

/**
 * Created with IntelliJ IDEA.
 * User: yanbit
 * Date: 10/12/15
 * Time: 2:02 PM
 * Description:
 */
public class MallardDuck extends Duck {
  public MallardDuck() {
    super();
    super.setFlyingStragety(new FlyWithWin());
    super.setQuackStragety(new BigQuack());
  }



  @Override public void dispaly() {
    System.out.println(" green duck");
  }
}
