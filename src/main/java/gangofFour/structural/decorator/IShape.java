package gangofFour.structural.decorator;

public interface IShape {
	/**
	 * Step 1 Create an interface
		Decorator pattern allows to add new functionality an existing object without altering its structure.
		This type of design pattern comes under structural pattern as this pattern acts as a wrapper to existing class.
		This pattern creates a decorator class which wraps the original class and
		provides additional functionality keeping class methods signature intact.
		We are demonstrating use of Decorator pattern via following example in which we'll decorate a shape with
		some color without alter shape class.
	 * */

	/**
	 * Decorator pattern cho phép add mới chức năng vào một đối tượng đã tồn tài không cần chỉnh sửa cấu trúc của nó.
	 * loại design pattern trở ở dưới structural pattern dang pattern mo rong, boc class dang ton tai
	 * 
	 * partern tao mot class decorator boc class chu so huu va cung cap them chuc nang du~ nhung method class tin hieu
	 * intact
	 * 
	 * Decorate shape
	 * Implementation
	 * We're going to create a Shape interface and concrete classes implementing the Shape interface.
	 * We then create a abstract decorator class: ShapeDecorator implementing the Shape interface and
	 * having Shape object as its instance variable.
	 * RedShapeDecorator is concrete(duc') class implementing ShapeDecorator.
	 * DecoratorPatternDemo, our demo class will use RedShapeDecorator to decorate Shape objects.
	 * */
	void draw();
	
	/**
	 * http://www.tienganh123.com/tieng-anh-tre-em-theo-chu-de/747-hinh-hoc.html
	 * cac hinh ten tieng anh
	 * */
}
