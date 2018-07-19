package other.servicelocator;

/**
 * Created by nguye on 11/4/16.
 */
public class ServiceLocatorPatternDemo {

  public static void main(String[] args) {
    Service service = ServiceLocator.getService("Service1");
    service.execute();
    service = ServiceLocator.getService("Service2");
    service.execute();
    service = ServiceLocator.getService("Service1");
    service.execute();
    service = ServiceLocator.getService("Service2");
    service.execute();
  }

}
