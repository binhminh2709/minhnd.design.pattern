package gangofFour.behavioural;

public class Client {

    private static final String MINH_ND = "nguyendinhminh";
    
    private final ILogging ILogging;
    
    public Client(ILogging ILogging) {
        this.ILogging = ILogging;
    }
    
    public void doWork(final int count) {
        if (count % 2 == 0) {
            ILogging.write("Even number: " + count);
        }
    }
    
/**
 * This enables you to write code using the Logging interface,
 * and the code you want to log does not need to be concerned if the logging is being written to the console output or to a file.
 * By programming to the interface rather than to a specific implementation, you can use the ConsoleLogging
 * strategy when testing your code, and use FileLoggingfor production use. At a later date, you can 
 * add more implementations of Logging, and any code written against the interface will not change 
 * but will be able to use the new implementation.
 * */
}
