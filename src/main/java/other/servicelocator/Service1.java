package other.servicelocator;

/**
 * Created by nguye on 11/4/16.
 */
public class Service1 implements Service {

    @Override
    public void execute(){
        System.out.println("Executing Service1");
    }

    @Override
    public String getName() {
        return "Service1";
    }

}
