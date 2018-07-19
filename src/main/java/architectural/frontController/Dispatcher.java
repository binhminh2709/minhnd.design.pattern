package architectural.frontController;

/**
 * Created by nguyen on 10/18/2016.
 */
public class Dispatcher {

  private StudentView studentView;
  private HomeView homeView;

  public Dispatcher() {
    studentView = new StudentView();
    homeView = new HomeView();
  }

  public void dispatch(String request) {
    if (request.equalsIgnoreCase("STUDENT")) {
      studentView.show();
    } else {
      homeView.show();
    }
  }
}
