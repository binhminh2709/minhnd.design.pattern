package gangofFour.creational.builder;

/**
 * Created by nguyen on 10/7/2016.
 */
public class TestBuilderPattern {

  public static void main(String[] args) {
    //Using builder to get the object in a single line of code and
    //without any inconsistent state or arguments management issues
    Computer comp = new Computer.ComputerBuilder(
        "500 GB", "2 GB").setBluetoothEnabled(true)
        .setGraphicsCardEnabled(true).build();
  }

}
