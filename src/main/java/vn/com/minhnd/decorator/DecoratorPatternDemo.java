package vn.com.minhnd.decorator;

public class DecoratorPatternDemo {
	
	/**
	 * Step 5
	 * Use the RedShapeDecorator to decorate Shape objects.
	 * */
	public static void main(String[] args) {
		
		Shape circle = new Circle();
		Shape redCircle = new RedShapeDecorator(new Circle());
		
		Shape rectangle = new Rectangle();
		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		
		System.out.println("Circle with normal border");
		circle.draw();
		
		System.out.println("\nCircle of red border");
		redCircle.draw();
		
		//chi ve hinh vuong
		System.out.println("Draw Rectangle with normal");
		rectangle.draw();
		//ve mot hinh vuong mau do
		System.out.println("\nRectangle of red border");
		redRectangle.draw();
		
		/**
		 * Mot ben la interface, gom cac class (A, B, C) cac loai hinh,
		 * mot ben la cac class (X, Y, Z) gom cac thuoc cua hinh extend mot abstractClass impl Interface
		 * 
		 * pattern nay co the them cac kieu hinh, va thuoc tinh cac hinh, mo hinh nay mang tinh mo rong dung nhu trong
		 * lời diễn giải,
		 * 
		 * Decorator pattern cho phép add mới chức năng vào một đối tượng đã tồn tài không cần chỉnh sửa cấu trúc của nó.
		 * loại design pattern trở ở dưới structural pattern dang pattern mo rong, boc class dang ton tai
		 * */
	}
	
}
