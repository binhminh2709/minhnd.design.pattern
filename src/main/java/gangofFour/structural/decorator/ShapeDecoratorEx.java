package gangofFour.structural.decorator;

public class ShapeDecoratorEx extends ShapeDecorator {

  /**
   * Step 4 Create concrete (duc', cu the hoa') decorator class extending the ShapeDecorator class.
   */
  public ShapeDecoratorEx(IShape decoratedIShape) {
    super(decoratedIShape);
  }

  @Override
  public void draw() {
    decoratedIShape.draw();
    setRedBorder(decoratedIShape);
  }

  private void setRedBorder(IShape decoratedIShape) {
    System.out.println("Border Color: Red");
  }

}
