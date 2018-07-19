package gangofFour.structural.decorator;

public class CircleImpl implements IShape {

  /**
   * Step 2 Create concrete classes implementing the same interface.
   */
  public CircleImpl() {
  }

  @Override
  public void draw() {
    System.out.println("Shape: Circle, hinh tron");
  }

}
