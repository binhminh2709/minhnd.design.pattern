package other.servicelocator;

/**
 * Created by nguye on 11/4/16.
 */
public class Service2 implements Service {

  @Override
  public void execute() {
    System.out.println("Executing Service2");
  }

  @Override
  public String getName() {
    return "Service2";
  }

}
