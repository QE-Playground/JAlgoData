import org.junit.Assert;
import org.junit.Test;

public class TestStack {

    @Test
    public void testStack() {
        //creating an instance of Stack class
        Stack<Integer> stk= new Stack<>();

        // checking stack is empty or not
        boolean result = stk.isEmpty();
        Assert.assertTrue(result == true);
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
        Assert.assertTrue(i == 120);
        System.out.println(String.format("Removing %s ...", i));
        stk.print();

    }
}
