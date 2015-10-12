package com.yanbit.adapter;

/**
 * Created with IntelliJ IDEA.
 * User: yanbit
 * Date: 10/12/15
 * Time: 11:24 AM
 */
public class NoteBook {
  private ThreePlugIf plug;

  public NoteBook(ThreePlugIf plug) {
    this.plug = plug;
  }

  // chong dian
  public void charge(){
    plug.powerWithThree();
  }

  public static void main(String[] args) {
    GBTwoPlug two = new GBTwoPlug();
    ThreePlugIf three = new TwoPlugAdapter(two);
    NoteBook nb = new NoteBook(three);
    nb.charge();
  }
}
