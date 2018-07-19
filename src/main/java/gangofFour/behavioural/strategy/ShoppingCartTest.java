package gangofFour.behavioural.strategy;

/**
 * Created by nguye on 11/13/16.
 */
public class ShoppingCartTest {

  public static void main(String[] args) {
    ShoppingCart cart = new ShoppingCart();
    Item item1 = new Item("1234", 10);
    Item item2 = new Item("5678", 40);
    cart.addItem(item1);
    cart.addItem(item2);
    //pay by paypal
    cart.pay(new PaypalPaymentStrategy("myemail@example.com", "mypwd"));
    // pay by credit card
    cart.pay(new CreditCardPaymentStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15"));
  }
}
