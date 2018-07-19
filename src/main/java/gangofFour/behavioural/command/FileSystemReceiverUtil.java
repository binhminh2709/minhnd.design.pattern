package gangofFour.behavioural.command;

/**
 * Created by binhminh on 11/12/2016.
 */
public class FileSystemReceiverUtil {

  public static IFileSystemReceiver getUnderlyingFileSystem() {
    String osName = System.getProperty("os.name");
    System.out.println("Underlying OS is:" + osName);
    if (osName.contains("Windows")) {
      return new WindowsFileSystemReceiver();
    } else {
      return new UnixFileSystemReceiver();
    }
  }

}
