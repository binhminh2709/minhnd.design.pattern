package vn.com.minhnd;

import org.junit.Test;

import java.io.*;
import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

public class Decorators {
    
    @Test
    public void decoratorPattern() throws IOException {
        final File f = new File("target", "out.bin");
        
        final OutputStream os = new OutputStream() {
            
            @Override
            public void write(int b) throws IOException {
                //todo nothing
            }
        };
        
        final InputStream is = new InputStream() {
            
            @Override
            public int read() throws IOException {
                //todo something
                return 0;
            }
        };
        
        final FileOutputStream fos = new FileOutputStream(f);
        
        final BufferedOutputStream bos = new BufferedOutputStream(fos);
        /**
         * A BufferedOutputStream will cache any calls to write, and will write several bytes at once (ngay lập tức).
         * This can be a huge (lớn) efficiency (hiệu năng) gain (lợi ích) when writing to disk
         * */
        final ObjectOutputStream oos = new ObjectOutputStream(fos);
        /**
         * ObjectOutputStreamis Java’s built-in serialization mechanism that writes objects
         * and primitive types to a stream
         * */
        
        oos.writeBoolean(true);
        oos.writeInt(42);
        oos.writeObject(new ArrayList<Integer>());
        
        oos.flush();
        oos.close();
        bos.close();
        fos.close();
        
        assertTrue(f.exists());
        
/**
 * Notice here that the ObjectOutputStreamdoes not know where the files are being written;
 * it is simply delegating to another OutputStream. The power of this pattern is that you can provide new 
 * OutputStream implementations, and these will work with those that already exist.

 * If, say, you wanted to write a log of every call to a BufferedOutputStream,
 * you could write an implementation easily enough, and it would work with the chain defined earlier.
 * Or if you wanted to encrypt data before writing, you could do that as well.

 * If you wanted to compress the data before writing to disk, you could use the GZIPOutputStream
 * class provided by the Java standard library.

 * Remember that the order in which you define the chain of OutputStreams may be important. 
 * When reading back data that was zipped before saving; you would definitely want to use a 
 * GZIPInputStreamto make sense of the data before using any other decorated InputStream objects
 * */
    }
}
