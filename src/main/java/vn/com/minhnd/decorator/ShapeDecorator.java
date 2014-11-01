package vn.com.minhnd.decorator;

public abstract class ShapeDecorator implements Shape {
	
	/**Step 3
	Create abstract decorator class implementing the Shape interface*/
	public ShapeDecorator() {
		
	}
	
	protected Shape decoratedShape;
	
	public ShapeDecorator(Shape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}
	
	public void draw() {
		decoratedShape.draw();
	}
}
