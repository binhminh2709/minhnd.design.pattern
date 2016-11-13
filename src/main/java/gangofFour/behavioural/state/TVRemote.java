package gangofFour.behavioural.state;

/**
 * Created by nguye on 11/13/16.
 */
public class TVRemote {
    public static void main(String[] args) {
        TVContextImpl context = new TVContextImpl();
        IState tvStartState = new TVStartStateImpl();
        IState tvStopState = new TVStopStateImpl();
        context.setState(tvStartState);
        context.doAction();
        context.setState(tvStopState);
        context.doAction();
    }
}
