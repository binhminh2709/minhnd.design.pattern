package gangofFour.behavioural.command;

/**
 * Created by nguye on 11/12/16.
 */
public class OpenFileCommand implements ICommand {

    private IFileSystemReceiver fileSystem;
    public OpenFileCommand(IFileSystemReceiver fs){ this.fileSystem=fs; }

    @Override
    public void execute() {

    }
}
