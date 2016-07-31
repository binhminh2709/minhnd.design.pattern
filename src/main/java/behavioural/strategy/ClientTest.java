package strategy;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class ClientTest {
    
    @Test
    public void useConsoleLogging() {
        //error: Client.MINH_ND;
        final Client c = new Client(new ConsoleLogging());
        c.doWork(32);
    }
    
    @Test
    public void useFileLogging() throws IOException {
        final File tempFile = File.createTempFile("test", "log");
        final Client c = new Client(new FileLogging(tempFile));
        c.doWork(41);
        c.doWork(42);
        c.doWork(43);
        
        final BufferedReader reader = new BufferedReader(new FileReader(tempFile));
        assertEquals("Even number: 42", reader.readLine());
        assertEquals(-1, reader.read());
    }
    
    @Test
    public void useMockLogging() {
        final Logging mockLogging = mock(Logging.class);
        final Client c = new Client(mockLogging);
        c.doWork(1);
        c.doWork(2);
        verify(mockLogging).write("Even number: 2");
    }
    
/**
 * The code used in Listings 6-3 and 6-4 is purely for the example of how to use the Strategy Pattern;
 * you should never implement logging this way, or ever write your own logger.
 * Java has many libraries dedicated to logging output, such as Log4J and SLF4J.
 * Look at these libraries and see if you can understand how the Strategy Pattern has been implemented,
 * and how you can specify different behaviors.
 * 
 * Using the Strategy Pattern enables you to defer(di'fə:/động từ- hoãn, trì hoãn) decisions about
 * which implementation to use until run time.
 * The Spring Framework uses an XML file to construct objects and their dependencies,
 * which are read at run time, allowing a quick change between implementations without any need for recompilation.
 * Chapter 16 has more information
 * */
}
