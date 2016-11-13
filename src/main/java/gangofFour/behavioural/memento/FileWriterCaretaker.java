package gangofFour.behavioural.memento;

/**
 * Created by nguye on 11/12/16.
 */
public class FileWriterCaretaker {
    private Object obj;

    public void save(FileWriterUtil fileWriter) {
        this.obj = fileWriter.save();
    }

    public void undo(FileWriterUtil fileWriter) {
        fileWriter.undoToLastSave(obj);
    }
}
