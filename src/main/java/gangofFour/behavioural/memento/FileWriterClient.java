package gangofFour.behavioural.memento;

/**
 * Created by nguye on 11/12/16.
 */
public class FileWriterClient {

  public static void main(String[] args) {

    FileWriterCaretaker caretaker = new FileWriterCaretaker();

    FileWriterUtil fileWriter = new FileWriterUtil("data.txt");
    fileWriter.write("first set data\n");
    System.out.println("1--\n" + fileWriter + "\n\n");

    //let save the file
    caretaker.save(fileWriter);

    //now write something else
    fileWriter.write("Second Set of data\n");

    //checking file contents
    System.out.println("2--\n" + fileWriter + "\n\n");

    //lets undo to last save
    caretaker.undo(fileWriter);

    //checking file content again
    System.out.println("3--n" + fileWriter + "\n\n");


  }
}
