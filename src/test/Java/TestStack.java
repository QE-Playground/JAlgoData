import org.junit.Test;

public class TestStack {
    /**
     * Currently I don't assert anything. Just look at the console log.
     */
    @Test
    public void testStack() {
        //creating an instance of Stack class
        Stack<Integer> stk= new Stack<>();

        // checking stack is empty or not
        boolean result = stk.isEmpty();
        System.out.println("Is the stack empty? " + result);

        // pushing elements into stack
        stk
                .push(78)
                .push(113)
                .push(90)
                .push(120)
                .print();

        // remove element at top of the stack
        Integer i = stk.pop();
        System.out.println(String.format("Removing %s ...", i));
        stk.print();

    }
}
