package com.yanbit.factory.basicfactory.abstractfactory;

/**
 * Created with IntelliJ IDEA.
 * User: yanbit
 * Date: 10/12/15
 * Time: 10:11 AM
 */
public class OldFactory implements PersonFactory {
  @Override public Boy getBoy() {
    return new OBoy();
  }

  @Override public Gril getGril() {
    return new OGril();
  }
}
