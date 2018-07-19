package gangofFour.behavioural.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by binhminh on 11/12/2016.
 */
public class ChatMediatorImpl implements IChatMediator {

  private List<User> users;

  public ChatMediatorImpl() {
    this.users = new ArrayList<>();
  }

  @Override
  public void sendMessage(String msg, User user) {
    for (User u : this.users) {
      //message should not be received by the user sending it
      if (u != user) {
        u.receive(msg);
      }
    }
  }

  @Override
  public void addUser(User user) {
    this.users.add(user);
  }
}
