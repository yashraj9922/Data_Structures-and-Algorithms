package Stacks;

public class StackArray {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public StackArray() {
        this(DEFAULT_SIZE);
    }

    public StackArray(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack is full!!!");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot pop from an empty stack!!");
        }
        int removed = data[ptr];
        ptr--;
        return removed;

        // return data[ptr--];
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot peek from an empty stack!!");
        }
        return data[ptr];
    }

    private boolean isFull() {
        return ptr == data.length - 1;// pointer is at last index
    }

    private boolean isEmpty() {
        return ptr == -1;
    }

    public static void main(String[] args) {
        StackArray s = new StackArray();
        try {
            s.push(0);
            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);
            s.push(5);

            while (!s.isEmpty()) {
                System.out.println(s.peek());
                s.pop();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
