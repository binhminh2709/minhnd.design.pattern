package vn.com.minhnd.strategy;

import java.io.File;

import org.junit.Test;

public class LoggingUnitTest {
    
    @Test
    public void loggingTest() {
        Logging console = new ConsoleLogging();
        console.write("minhnd");
        
        File f = new File("data.txt");
        Logging file = new FileLogging(f);
        file.write("minhnd");
    }
}
