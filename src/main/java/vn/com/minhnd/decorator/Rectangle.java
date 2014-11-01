package vn.com.minhnd.decorator;

public class Rectangle implements Shape{
	
	/**
	 * Step 2 Create concrete classes implementing the same interface
	 * */
	public Rectangle() {
	}

	@Override
	public void draw() {
		System.out.println("Shape: Rectangle, hinh chu nhat");
	}
}
