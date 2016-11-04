package architecturalpattern.frontController;

/**
 * Created by nguyen on 10/18/2016.
 */
public class FrontControllerPatternDemo {

    public static void main(String[] args) {

        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}
