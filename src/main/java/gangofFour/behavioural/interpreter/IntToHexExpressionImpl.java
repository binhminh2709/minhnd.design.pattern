package gangofFour.behavioural.interpreter;

/**
 * Created by binhminh on 11/12/2016.
 */
public class IntToHexExpressionImpl implements IExpression {

  private int i;

  public IntToHexExpressionImpl(int c) {
    this.i = c;
  }

  @Override
  public String interpret(InterpreterContext ic) {
    return ic.getHexadecimalFormat(i);
  }
}
