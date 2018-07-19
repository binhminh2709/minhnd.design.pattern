package gangofFour.creational.abstractfactory;

public class DanishBakery implements Bakery {
  @Override public Pastry apply(Topping topping) {
    return new DanishPastry(Topping topping);
  }
}

