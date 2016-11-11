package gangofFour.behavioural.command;

/**
 * Created by nguye on 11/12/16.
 */
public class OpenFileCommand implements ICommand {

    private FileSystemReceiver fileSystem;
    public OpenFileCommand(FileSystemReceiver fs){ this.fileSystem=fs; }

    @Override
    public void execute() {

    }
}
