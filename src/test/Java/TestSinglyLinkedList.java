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

    @Test
    public void testAppendTail() {
        SinglyLinkedList<Integer> listInt   = new SinglyLinkedList<>();
        SinglyLinkedList<String>  listString = new SinglyLinkedList<>();

        System.out.println("A singly linked list with integer data");

        listInt
                .appendTail(1)
                .appendTail(2)
                .appendTail(3)
                .appendTail(4)
                .appendTail(5)
                .print();

        System.out.println("A singly linked list with String data");

        listString
                .appendTail("Vietnam")
                .appendTail("France")
                .appendTail("Switzerland")
                .appendTail("Australia")
                .appendTail("Ireland")
                .print();
    }
}
