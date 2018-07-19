package gangofFour.structural.decorator;

public abstract class ShapeDecorator implements IShape {

  protected IShape decoratedIShape;

  /**
   * Step 3 Create abstract decorator class implementing the Shape interface
   */
  public ShapeDecorator() {

  }

  public ShapeDecorator(IShape decoratedIShape) {
    this.decoratedIShape = decoratedIShape;
  }

  public void draw() {
    decoratedIShape.draw();
  }
}
