package structural.proxy;

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

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
        return a - b;
    }

    public void commont(){

    }
}
