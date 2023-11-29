package Linked_Lists;

public class linkedList {
    private Node head;
    private Node tail;
    private int size;

    public linkedList() {
        this.size = 0;
    }

    private class Node {

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public void insertAtFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            // this means that first item is been added
            tail = head;
        }
        size++;
    }

    public void insertAtLast(int value) {
        if (tail == null) {
            insertAtFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;

        size++;
    }

    public void insert(int value, int index) {
        Node node = new Node(value);
        if (index == 0) {
            insertAtFirst(value);
            return;
        }
        if (index == size) {
            insertAtLast(value);
            return;
        }

        Node previousNode = head;
        for (int i = 0; i < index - 1; i++) {
            previousNode = previousNode.next;
        }

        Node currentNode = previousNode.next;
        previousNode.next = node;
        node.next = currentNode;
        size++;
    }

    public Node deleteAtFirst() {
        if (head == null) {
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        size--;
        return temp;
    }

    public Node getNode(int index) {
        Node node = head;
        int idx = 0;
        while (idx < index) {
            node = node.next;
            idx++;
        }
        return node;
    }

    public Node deleteAtLast() {
        if (size <= 1) {
            return deleteAtFirst();
        }

        Node secondLast = getNode(size - 2);
        Node temp = tail;
        tail = secondLast;
        tail.next = null;
        size--;
        return temp;
    }

    public Node deleteNode(int index) {
        if (index == 0) {
            return deleteAtFirst();
        }
        if (index == size - 1) {
            return deleteAtLast();
        }

        Node prevNode = getNode(index - 1);
        Node currentNode = prevNode.next;
        prevNode.next = currentNode.next;
        currentNode.next = null;
        size--;
        return currentNode;
    }

    public Node findNode(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void displayLL() {
        // instead of traversing original head pointer as head.next we use temp var as
        // it will be out of Scope one function is run and will be reassign to head for
        // next time...
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.value + " --> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.insertAtFirst(10);
        ll.insertAtFirst(20);
        ll.insertAtFirst(30);
        ll.insertAtFirst(40);
        ll.insertAtFirst(50);
        ll.insertAtLast(60);
        ll.insert(70, 3);
        ll.displayLL();
        System.out.println("ll.deleteAtFirst()");
        ll.deleteAtFirst();
        ll.displayLL();
        System.out.println("ll.deleteAtLast()");
        ll.deleteAtLast();
        ll.displayLL();
        System.out.println("ll.deleteNode(2)");
        ll.deleteNode(2);
        ll.displayLL();
        System.out.println("ll.findNode(100)");
        System.out.println(ll.findNode(100));
        System.out.println("ll.findNode(20)");
        System.out.println(ll.findNode(20));
    }
}
