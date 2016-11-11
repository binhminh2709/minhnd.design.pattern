package gangofFour.behavioural.strategy;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class FileLogging implements Logging {
    
    private static Log _log = LogFactory.getLog(FileLogging.class);
    
    private final File toWrite;
    
    public FileLogging(final File toWrite) {
        this.toWrite = toWrite;
    }
    
    @Override
    public void write(final String message) {
        try {
            final FileWriter fos = new FileWriter(toWrite);
            fos.write(message);
            fos.close();
        } catch (IOException e) {
            // handle IOException
            _log.error(e);
        }
    }
}
