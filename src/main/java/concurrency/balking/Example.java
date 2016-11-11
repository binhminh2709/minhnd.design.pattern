package concurrency.balking;

/**
 * Created by binhminh on 11/11/2016.
 */
public class Example {

    private boolean jobInProgress = false;

    public void job() {
        synchronized(this) {
            if (jobInProgress) {
                return;
            }
            jobInProgress = true;
        }
        // Code to execute job goes here
        // ...
    }

    void jobCompleted() {
        synchronized(this) {
            jobInProgress = false;
        }
    }
}
