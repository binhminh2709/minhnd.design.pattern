package gangofFour.behavioural.command;

/**
 * Created by binhminh on 11/12/2016.
 */
public class FileInvoker {

    public ICommand command;

    public FileInvoker(ICommand c) {
        this.command = c;
    }

    public void execute() {
        this.command.execute();
    }
}
