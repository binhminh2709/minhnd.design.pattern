package gangofFour.behavioural.chainof.responsibility;

/**
 * Created by nguye on 11/12/16.
 */
public class FileLogger extends AbstractLogger {

  public FileLogger(int level) {
    this.level = level;
  }


  @Override
  protected void write(String message) {
    System.out.println("File::Logger: " + message);
  }
}
