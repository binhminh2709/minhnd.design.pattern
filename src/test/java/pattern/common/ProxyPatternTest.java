package pattern.common;

import structural.proxy.CommandExecutor;
import structural.proxy.CommandExecutorProxy;

/**
 * Created by Administrator on 10/1/2015.
 */
public class ProxyPatternTest {

    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutorProxy("Pankaj", "wrong_pwd");
        try {
            executor.runCommand("ls -ltr");
            executor.runCommand(" rm -rf abc.pdf");
        } catch (Exception e) {
            System.out.println("Exception Message::" + e.getMessage());
        }

    }
}
