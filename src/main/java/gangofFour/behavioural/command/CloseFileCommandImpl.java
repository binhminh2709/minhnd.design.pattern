package gangofFour.behavioural.command;

/**
 * Created by binhminh on 11/12/2016.
 */
public class CloseFileCommandImpl implements ICommand {

    private IFileSystemReceiver fileSystem;

    public CloseFileCommandImpl(IFileSystemReceiver fs) {
        this.fileSystem = fs;
    }

    @Override
    public void execute() {
        this.fileSystem.closeFile();
    }
}
