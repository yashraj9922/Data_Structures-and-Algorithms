public class QueueLL {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;
    static Node tail = null;

    public static boolean isEmpty() {
        return head == null && tail == null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            tail = head = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!!!");
            return -1;
        }

        int front = head.data;
        if (head == tail) {
            tail = null;
        }
        head = head.next;

        return front;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!!!");
            return -1;
        }
        return head.data;
    }

    public static void main(String[] args) {
        QueueLL q = new QueueLL();
        q.add(0);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!QueueLL.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
