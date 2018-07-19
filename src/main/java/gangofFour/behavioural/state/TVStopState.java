package gangofFour.behavioural.state;

/**
 * Created by nguye on 11/13/16.
 */
public class TVStopState implements State {

  @Override
  public void doAction() {
    System.out.println("TV is turned OFF");
  }
}
