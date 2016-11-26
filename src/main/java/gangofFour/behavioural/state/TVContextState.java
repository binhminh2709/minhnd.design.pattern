package gangofFour.behavioural.state;

/**
 * Created by nguye on 11/13/16.
 */
public class TVContextState implements State {

    private State tvState;

    public void setState(State state) {
        this.tvState = state;
    }

    public State getState() {
        return this.tvState;
    }

    @Override
    public void doAction() {
        this.tvState.doAction();
    }
}
