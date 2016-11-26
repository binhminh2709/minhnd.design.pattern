package gangofFour.behavioural.state;

/**
 * Created by nguyen on 10/7/2016.
 */
public class TVRemoteBasicTest {
    private String state = "";

    public void setState(String state) {
        this.state = state;
    }

    public void doAction() {
        if (state.equalsIgnoreCase("ON")) {
            System.out.println("TV is turned ON");
        } else if (state.equalsIgnoreCase("OFF")) {
            System.out.println("TV is turned OFF");
        }
    }

    public static void main(String args[]) {
        TVRemoteBasicTest remote = new TVRemoteBasicTest();
        remote.setState("ON");
        remote.doAction();
        remote.setState("OFF");
        remote.doAction();
    }
}
