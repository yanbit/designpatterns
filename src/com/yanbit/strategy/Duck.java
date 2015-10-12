package com.yanbit.strategy;

import com.yanbit.strategy.fly.FlyingStragety;
import com.yanbit.strategy.quack.QuackStragety;

/**
 * Created with IntelliJ IDEA.
 * User: yanbit
 * Date: 10/12/15
 * Time: 2:00 PM
 * Description:
 */
public abstract class Duck {

  public QuackStragety quackStragety;

  public void quack(){
    quackStragety.quack();
  }

  public abstract void dispaly();

  private FlyingStragety flyingStragety;

  public void fly() {
    flyingStragety.performFly();
  }

  public FlyingStragety getFlyingStragety() {
    return flyingStragety;
  }

  public void setFlyingStragety(FlyingStragety flyingStragety) {
    this.flyingStragety = flyingStragety;
  }

  public QuackStragety getQuackStragety() {
    return quackStragety;
  }

  public void setQuackStragety(QuackStragety quackStragety) {
    this.quackStragety = quackStragety;
  }

}
