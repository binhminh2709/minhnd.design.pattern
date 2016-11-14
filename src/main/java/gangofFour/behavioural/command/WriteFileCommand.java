package gangofFour.behavioural.command;

/**
 * Created by binhminh on 11/12/2016.
 */
public class WriteFileCommand implements ICommand {

    private IFileSystemReceiver fileSystem;

    public WriteFileCommand(IFileSystemReceiver fs) {
        this.fileSystem = fs;
    }

    @Override
    public void execute() {
        this.fileSystem.writeFile();
    }
}
