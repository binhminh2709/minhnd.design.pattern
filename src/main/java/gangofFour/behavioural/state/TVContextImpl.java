package gangofFour.behavioural.state;

/**
 * Created by nguye on 11/13/16.
 */
public class TVContextImpl implements IState {

    private IState tvState;

    public void setState(IState state) {
        this.tvState = state;
    }

    public IState getState() {
        return this.tvState;
    }

    @Override
    public void doAction() {
        this.tvState.doAction();
    }
}
