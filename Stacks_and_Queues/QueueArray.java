public class QueueArray {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = 0;

    public QueueArray() {
        this(DEFAULT_SIZE);
    }

    public QueueArray(int size) {
        this.data = new int[size];
    }

    private boolean isFull() {
        return end == data.length;
    }

    private boolean isEmpty() {
        return end == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }

        data[end] = item;
        end++;
        // data[end++] = item;

        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty!!");
        }

        int removed = data[0];

        // shift the elements to left
        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }
        end--;

        return removed;
    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty!!");
        }
        return data[0];
    }

    public static void main(String[] args) {
        QueueArray q = new QueueArray(5);
        q.insert(3);
        q.insert(4);
        q.insert(5);
        q.insert(6);
        q.insert(7);

        try {
            while (!q.isEmpty()) {
                System.out.println(q.front());
                q.remove();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
