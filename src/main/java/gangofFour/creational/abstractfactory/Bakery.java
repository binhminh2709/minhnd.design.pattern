package gangofFour.creational.abstractfactory;

@FunctionalInterface
public interface Bakery {

  Pastry bakePastry(Topping topping);

}
