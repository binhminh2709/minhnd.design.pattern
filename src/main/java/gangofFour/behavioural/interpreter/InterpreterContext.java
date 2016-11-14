package gangofFour.behavioural.interpreter;

/**
 * Created by binhminh on 11/12/2016.
 */
public class InterpreterContext {

    public String getBinaryFormat(int i){
        return Integer.toBinaryString(i);
    }

    public String getHexadecimalFormat(int i){
        return Integer.toHexString(i);
    }

}
