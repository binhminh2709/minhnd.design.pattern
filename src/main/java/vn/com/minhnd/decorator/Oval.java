package vn.com.minhnd.decorator;

public class Oval implements Shape {
	
	public Oval() {
	}

	@Override
	public void draw() {
		System.out.println("Shape: Oval, hinh oival");
	}
	
}
