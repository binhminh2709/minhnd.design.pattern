package gangofFour.structural.proxy;

import java.io.IOException;

/**
 * Created by Administrator on 10/1/2015.
 */
public class CommandExecutorImpl implements CommandExecutor {

  @Override
  public void runCommand(String cmd) throws IOException {
    //some heavy implementation
    Runtime.getRuntime().exec(cmd);
    System.out.println("'" + cmd + "' command executed.");
  }
}
