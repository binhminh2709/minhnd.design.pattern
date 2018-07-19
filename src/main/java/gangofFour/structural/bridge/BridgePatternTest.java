package gangofFour.structural.bridge;

/**
 * Created by nguye on 11/14/16.
 */
public class BridgePatternTest {

  public static void main(String[] args) {
    Shape tri = new Triangle(new RedColor());
    tri.applyColor();
    Shape pent = new Pentagon(new GreenColor());
    pent.applyColor();
  }
}
