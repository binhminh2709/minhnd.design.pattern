package gangofFour.behavioural.observer;

/**
 * Created by nguyen on 10/15/2016.
 */
public interface IObserver {

  //method to update the observer, used by subject
  public void update();

  //attach with subject to observe
  public void setSubject(ISubject sub);
}
