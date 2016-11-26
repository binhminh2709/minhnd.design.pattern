package gangofFour.structural.decorator;

public class RectangleImpl implements IShape {
	
	/**
	 * Step 2 Create concrete classes implementing the same interface
	 * */
	public RectangleImpl() {
	}

	@Override
	public void draw() {
		System.out.println("Shape: Rectangle, hinh chu nhat");
	}
}
