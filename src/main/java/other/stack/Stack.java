package other.stack;

import java.util.LinkedList;

/**
 * Listing 6-6: A stack
 */
public class Stack {

  /**
   * Stack sử dụng LinkedList, do phải add or remove element, nên dùng LinkedList performe tốt hơn ArrayList
   */
  private final LinkedList<Integer> stack;


  public Stack() {
    stack = new LinkedList<>();
  }

  public Stack(final LinkedList<Integer> initialState) {
    this.stack = initialState;
  }

  public void push(final int number) {
    stack.add(0, number);
  }

  public Integer pop() {
    return stack.remove(0);
  }

  public Stack filter(final StackPredicate filter) {
    final LinkedList<Integer> initialState = new LinkedList<>();
    for (Integer integer : stack) {
      if (filter.isValid(integer)) {
        initialState.add(integer);
      }
    }
    return new Stack(initialState);
  }

/**
 * The Template Pattern is used to defer (di'fə:/ động từ - hoãn, trì hoãn, để chậm lại) or 
 * delegate (/'deligit/ danh từ - người đại biểu) some or all steps of an algorithm to a subclass. 
 * Common behavior can be defined in a superclass, and then specific variants are written in a subclass.
 * Listing 6-6 shows a possible definition for a stack, backed by a LinkedList and an interface 
 * for filtering a Stack instance, called StackPredicate.
 *
 * The StackPredicate is an implementation of the Template Pattern that allows client code to define exactly
 * how the filtering should work.
 * The filter method has specific logic: It iterates through each value in the stack,
 * and asks the predicate if that value is to be included in the filtered stack to return.
 * The logic in the filter method is completely isolated from the specific logic of the StackPredicatein deciding
 * whether a given value is valid to be filtered.
 * */
}
