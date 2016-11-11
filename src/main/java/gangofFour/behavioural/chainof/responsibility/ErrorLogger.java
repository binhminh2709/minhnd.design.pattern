package gangofFour.behavioural.chainof.responsibility;

/**
 * Created by nguye on 11/12/16.
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){ this.level = level; }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
