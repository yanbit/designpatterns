package com.yanbit.factory.basicfactory.abstractfactory;

/**
 * Created with IntelliJ IDEA.
 * User: yanbit
 * Date: 10/12/15
 * Time: 10:08 AM
 */
public class YongFactory implements PersonFactory {
  @Override public Boy getBoy() {
    return new YBoy();
  }

  @Override public Gril getGril() {
    return new YGril();
  }
}
