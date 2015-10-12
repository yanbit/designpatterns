package com.yanbit.adaptermy;

/**
 * Created with IntelliJ IDEA.
 * User: yanbit
 * Date: 10/12/15
 * Time: 11:53 AM
 * Description:
 */
public class Andriod {
  private USBPower usbPower;

  public Andriod(USBPower usbPower) {
    this.usbPower = usbPower;
  }

  public void power(){
    usbPower.usbPower();
  }

  public static void main(String[] args){
    PCPower pcPower = new PCPower();
    USBPower usbPower = new PCSwithUSBPower(pcPower);
    Andriod and = new Andriod(usbPower);
    and.power();
  }
}
