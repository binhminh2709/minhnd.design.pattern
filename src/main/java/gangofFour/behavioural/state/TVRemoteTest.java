package gangofFour.behavioural.state;

/**
 * Created by nguye on 11/13/16.
 */
public class TVRemoteTest {

  public static void main(String[] args) {

    TVContextState context = new TVContextState();
    State tvStartState = new TVStartState();
    State tvStopState = new TVStopState();

    context.setState(tvStartState);
    context.doAction();

    context.setState(tvStopState);
    context.doAction();
  }
}
