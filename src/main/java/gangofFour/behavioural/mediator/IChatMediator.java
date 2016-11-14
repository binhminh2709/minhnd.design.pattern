package gangofFour.behavioural.mediator;

/**
 * Created by nguyen on 10/7/2016.
 */
public interface IChatMediator {
    public void sendMessage(String msg, User user);
    void addUser(User user);

}
