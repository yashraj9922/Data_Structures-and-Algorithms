package Linked_Lists;

public class DoublyLL {

    private Node head;
    private Node tail;

    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }
    }

    public void insertFirst(int value) {
        Node node = new Node(value);

        node.next = head;
        node.prev = null;

        if (head != null) {
            head.prev = node;
        }

        head = node;
    }

    public void display() {
        Node currentNode = head;

        while (currentNode != null) {
            System.out.print(currentNode.value + " --> ");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");
    }

    public void displayReverse(){
        
    }

    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();

        dll.insertFirst(1);
        dll.insertFirst(2);
        dll.display();
    }
}
