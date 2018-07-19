package gangofFour.behavioural.strategy;

/**
 * Created by nguye on 11/13/16.
 */
public class Item {

  private String upcCode;
  private int price;

  public Item(String upc, int cost) {
    this.upcCode = upc;
    this.price = cost;
  }

  public String getUpcCode() {
    return upcCode;
  }

  public int getPrice() {
    return price;
  }
}
