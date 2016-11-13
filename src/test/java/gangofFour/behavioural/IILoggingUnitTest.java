package gangofFour.behavioural;

import java.io.File;

import org.junit.Test;

public class IILoggingUnitTest {
    
    @Test
    public void loggingTest() {
        ILogging console = new ConsoleILogging();
        console.write("minhnd");
        
        File f = new File("data.txt");
        ILogging file = new FileILogging(f);
        file.write("minhnd");
    }
}
