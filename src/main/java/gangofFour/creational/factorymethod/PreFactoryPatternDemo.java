package gangofFour.creational.factorymethod;

public class PreFactoryPatternDemo {
    
    ICar createCar(String carType) {
        ICar c = null;
        if (carType.equals("Audi")) {
            c = new Audi();
        } else if (carType.equals("BMW")) {
            c = new BMW();
        } else if (carType.equals("Ferrari")) {
            c = new Ferrari();
        } else if (carType.equals("volkswagen")) {
            c = new Ferrari();
        } else if (carType.equals("chevrolet")) {
            c = new Ferrari();
        } else if (carType.equals("hyundai")) {
            c = new Ferrari();
        } else if (carType.equals("Maruti")) {
            c = new Ferrari();
        }
        return c;
    }
    
/**
 * Here we have got several class being instantiated
 * and the decision of which to instantiate is made at run time depending on condition.
 * When it comes time for change or extensions  you'll need to open this code and examine what need to be added or deleted.
 * This kind of code ends up in several part of the application making maintenance and update more difficult.

 * By coding to interface, you can free yourself from a lot of changes that might happen to a system down the road. How? 
 * If your code is written to interface, then it work with any new class implementing that interface through polymorphism.
 * But, when you have code that make a lot of concrete class,
 * you are looking for trouble because that code may have to changed as new concrete classed are added.
 * It means this code is not "closed for modification".
 * */
}
