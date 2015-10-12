package com.yanbit.factory.basicfactory.abstractfactory;

/**
 * Created with IntelliJ IDEA.
 * User: yanbit
 * Date: 10/12/15
 * Time: 10:11 AM
 */
public class Client {
  public static void main(String[] args){
    PersonFactory yfactory = new YongFactory();
    Boy boy = yfactory.getBoy();
    boy.getBoy();

    PersonFactory ofactory = new OldFactory();
    Gril gril = ofactory.getGril();
    gril.getGirl();
  }
}
