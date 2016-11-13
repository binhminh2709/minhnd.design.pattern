package gangofFour.behavioural;

public class ConsoleILogging implements ILogging {
    
    @Override
    public void write(final String message) {
        System.out.println(message);
    }
}
