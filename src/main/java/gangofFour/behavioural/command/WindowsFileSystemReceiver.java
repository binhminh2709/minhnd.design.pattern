package gangofFour.behavioural.command;

/**
 * Created by nguye on 11/12/16.
 */
public class WindowsFileSystemReceiver implements IFileSystemReceiver {

  @Override
  public void openFile() {
    System.out.println("Opening file in Windows OS");
  }

  @Override
  public void writeFile() {
    System.out.println("Writing file in Windows OS");
  }

  @Override
  public void closeFile() {
    System.out.println("Closing file in Windows OS");
  }
}
