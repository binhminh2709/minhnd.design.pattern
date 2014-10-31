package vn.com.minhnd.strategy;

public class ConsoleLogging implements Logging {
    
    @Override
    public void write(final String message) {
        System.out.println(message);
    }
}
