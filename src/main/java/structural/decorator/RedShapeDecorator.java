package structural.decorator;

public class RedShapeDecorator extends ShapeDecorator {
	
	/**
	 * Step 4
	 * Create concrete (duc', cu the hoa') decorator class extending the ShapeDecorator class.
	 * */
	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}
	
	@Override
	public void draw() {
		decoratedShape.draw();
		setRedBorder(decoratedShape);
	}
	
	private void setRedBorder(Shape decoratedShape) {
		System.out.println("Border Color: Red");
	}
	
}
