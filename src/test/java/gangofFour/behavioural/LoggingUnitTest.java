package gangofFour.behavioural;

import java.io.File;

import gangofFour.behavioural.strategy.ConsoleLogging;
import gangofFour.behavioural.strategy.FileLogging;
import gangofFour.behavioural.strategy.Logging;
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
