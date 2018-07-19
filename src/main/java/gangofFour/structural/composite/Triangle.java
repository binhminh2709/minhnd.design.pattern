package gangofFour.structural.composite;


/**
 * Created by nguye on 11/14/16.
 */
public class Triangle implements Shape {

  @Override
  public void draw(String fillColor) {
    System.out.println("Drawing Triangle with color " + fillColor);
  }
}
