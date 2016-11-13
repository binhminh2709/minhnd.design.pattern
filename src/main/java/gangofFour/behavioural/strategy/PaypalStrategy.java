package gangofFour.behavioural.strategy;

/**
 * Created by nguye on 11/13/16.
 */
public class PaypalStrategy implements IPaymentStrategy {

    private String emailId;
    private String password;

    public PaypalStrategy(String email, String pwd) {
        this.emailId = email;
        this.password = pwd;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Paypal.");
    }
}
