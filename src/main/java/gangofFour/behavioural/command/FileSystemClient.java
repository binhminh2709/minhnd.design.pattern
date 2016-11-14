package gangofFour.behavioural.command;

/**
 * Created by binhminh on 11/12/2016.
 */
public class FileSystemClient {

    public static void main(String[] args) {
        //Creating the receiver object
        IFileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();

        //creating command and associating with receiver
        OpenFileCommand openFileCommand = new OpenFileCommand(fs);
        FileInvoker file = new FileInvoker(openFileCommand);//Creating invoker and associating with Command
        file.execute();//perform action on invoker object

        WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
        file = new FileInvoker(writeFileCommand);
        file.execute();

        CloseFileCommandImpl closeFileCommand = new CloseFileCommandImpl(fs);
        file = new FileInvoker(closeFileCommand);
        file.execute();
    }
}
