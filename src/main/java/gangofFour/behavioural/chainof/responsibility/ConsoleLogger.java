package gangofFour.behavioural.chainof.responsibility;

/**
 * Created by nguye on 11/12/16.
 */
public class ConsoleLogger extends AbstractLogger {

  public ConsoleLogger(int level) {
    this.level = level;
  }

  @Override
  protected void write(String message) {
    System.out.println("Standard Console::Logger: " + message);
  }
}
