package gangofFour.behavioural.interpreter;

/**
 * Created by binhminh on 11/12/2016.
 */
public class IntToBinaryExpressionImpl implements IExpression {

    private int i;

    public IntToBinaryExpressionImpl(int c) {
        this.i = c;
    }


    @Override
    public String interpret(InterpreterContext ic) {
        return ic.getBinaryFormat(this.i);
    }
}
