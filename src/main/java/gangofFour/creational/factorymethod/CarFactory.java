package gangofFour.creational.factorymethod;


public class CarFactory {

  /**
   * In this post, we'll see how Factory method Design Pattern come into picture, what advantages it will provide and how it help in implementing loose coupling concept.
   * <p>
   * Below picture shows Car factory that produce different car depending on it's feature and model. For instance, it produces BMW 1 series, BMW 2 Series, BMW M3 etc. Whatever order we placed for car, factory will
   * produce.
   * <p>
   * This same concept applies to Factory Design pattern.
   * <p>
   * From the name itself you can identify what does this pattern do. Factory method pattern is used for creating object based on different parameters. If we ask for BMW M3, the factory will produce BMW M3; if we ask for
   * Ferrari, factory will produce Ferrari.
   * <p>
   * The factory method pattern is an object-oriented creational design pattern to implement the concept of factories and deals with the problem of creating objects (products) without specifying the exact class of object
   * that will be created. The essence of this pattern is to "Define an interface for creating an object, but let the classes that implement the interface decide which class to instantiate.
   */

  public static ICar createCar(String carType) {
    ICar c = null;
    if (carType.equals("Audi")) {
      c = new Audi();
    } else if (carType.equals("BMW")) {
      c = new BMW();
    } else if (carType.equals("Ferrari")) {
      c = new Ferrari();
    }
    return c;
  }


}
