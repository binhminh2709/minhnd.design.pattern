package gangofFour.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nguyen on 10/15/2016.
 */
public class MyTopic implements ISubject {

  private final Object MUTEX = new Object();
  private List<IObserver> IObservers;
  private String message;
  private boolean changed;

  public MyTopic() {
    this.IObservers = new ArrayList<>();
  }

  @Override
  public void register(IObserver obj) {
    if (obj == null) {
      throw new NullPointerException("Null Observer");
    }
    synchronized (MUTEX) {
      if (!IObservers.contains(obj)) {
        IObservers.add(obj);
      }
    }
  }

  @Override
  public void unregister(IObserver obj) {
    synchronized (MUTEX) {
      IObservers.remove(obj);
    }
  }

  @Override
  public void notifyObservers() {
    List<IObserver> observersLocal = null;
    //synchronization is used to make sure any observer registered after message is received is not notified
    synchronized (MUTEX) {
      if (!changed) {
        return;
      }
      observersLocal = new ArrayList<>(this.IObservers);
      this.changed = false;
    }
    for (IObserver obj : observersLocal) {
      obj.update();
    }

  }

  @Override
  public Object getUpdate(IObserver obj) {
    return this.message;
  }

  //method to post message to the topic
  public void postMessage(String msg) {
    System.out.println("Message Posted to Topic:" + msg);
    this.message = msg;
    this.changed = true;
    notifyObservers();
  }
}
