package com.yanbit.adaptermy;

/**
 * Created with IntelliJ IDEA.
 * User: yanbit
 * Date: 10/12/15
 * Time: 11:56 AM
 * Description:
 */
public class PCSwithUSBPower implements USBPower {
  public PCPower pcPower;

  public PCSwithUSBPower(PCPower pcPower) {
    this.pcPower = pcPower;
  }



  @Override public void usbPower() {
    System.out.println("----------pc swith usb-------------");
    pcPower.otherPower();
  }
}
