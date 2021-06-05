import org.junit.Test;

public class TestSinglyLinkedList {
    /**
     * Currently I don't assert anything. Just look at the console log.
     */

    @Test
    public void testAppendHead() {
        SinglyLinkedList<Integer> listInt   = new SinglyLinkedList<>();
        SinglyLinkedList<Float>   listFloat = new SinglyLinkedList<>();

        System.out.println("A singly linked list with integer data");

        listInt
                .appendHead(1)
                .appendHead(2)
                .appendHead(3)
                .appendHead(4)
                .appendHead(5)
                .print();

        System.out.println("A singly linked list with float data");

        listFloat
                .appendHead(1.0f)
                .appendHead(2.0f)
                .appendHead(3.0f)
                .appendHead(4.0f)
                .appendHead(5.0f)
                .print();
    }
}
