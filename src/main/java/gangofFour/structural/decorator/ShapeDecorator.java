package gangofFour.structural.decorator;

public abstract class ShapeDecorator implements IShape {
	
	/**Step 3
	Create abstract decorator class implementing the Shape interface*/
	public ShapeDecorator() {
		
	}
	
	protected IShape decoratedIShape;
	
	public ShapeDecorator(IShape decoratedIShape) {
		this.decoratedIShape = decoratedIShape;
	}
	
	public void draw() {
		decoratedIShape.draw();
	}
}
