package com.yanbit.adapter;

/**
 * Created with IntelliJ IDEA.
 * User: yanbit
 * Date: 10/12/15
 * Time: 11:27 AM
 * Descript: 2 to 3
 */
public class TwoPlugAdapter implements ThreePlugIf {
  private GBTwoPlug plug;

  public TwoPlugAdapter(GBTwoPlug plug) {
    this.plug = plug;
  }

  @Override public void powerWithThree() {
    System.out.println("2 ---> 3");
    plug.powerWithTwo();
  }
}
