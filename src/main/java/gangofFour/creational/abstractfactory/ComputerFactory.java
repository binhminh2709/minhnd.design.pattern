package gangofFour.creational.abstractfactory;

/**
 * Created by nguyen on 10/6/2016.
 */
public class ComputerFactory {

  public static Computer getComputer(ComputerAbstractFactory factory) {
    return factory.createComputer();
  }
}
