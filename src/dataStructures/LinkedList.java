package dataStructures;

/**
 *
 * @author Hani Mohammed (Hani Badawy)
 * @param <T>
 */
public class LinkedList<T> {

    SLLNode<T> head, tail;
    int length;

    /**
     * Constructs an empty linked list
     */
    public LinkedList() {
        head = tail = null;
        length = 0;
    }

    public void add(SLLNode<T> node) {
        if (isEmpty()) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        length++;
    }

    public void add(T value) {
        SLLNode<T> node = new SLLNode<>(value);
        if (isEmpty()) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        length++;
    }

    public void pop() {
        if (!isEmpty()) {
            SLLNode<T> node = head;
            SLLNode<T> prev = node;

            while (node.next != null) {
                prev = node;
                node = node.next;
            }
            prev.next = tail;
            tail = node;
            length--;
        }
    }

    public void insert(int loc, SLLNode<T> node) {
        if (loc <= length) {
            SLLNode<T> current = head;
            for (int i = 0; i < loc - 1; i++) {
                current = current.next;
            }
            SLLNode<T> temp = current.next.next;
            current.next = node;
            node.next = temp;
            length++;
        }

    }

    public boolean isEmpty() {
        return length == 0;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Length:\t");
        builder.append(length);
        builder.append("\nData:\t");
        SLLNode node = head;

        for (int i = 0; i < length; i++) {
            builder.append(node);
            builder.append('\t');
            node = node.next;
        }
        return builder.toString();
    }
}
