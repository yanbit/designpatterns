package com.yanbit.adaptermy;

/**
 * Created with IntelliJ IDEA.
 * User: yanbit
 * Date: 10/12/15
 * Time: 1:24 PM
 * Description:
 */
public class PCSwithUSBExtend extends PCPower implements USBPower {

  @Override public void usbPower() {
    this.otherPower();
  }
}
