
package dataStructures;

/**
 *
 * @author Hani Mohammed (Hani Badawy)
 *
 * Singly Linked List Node
 * @param <T>
 */
public class SLLNode<T> {

    public T value; // No restrictions on setting or getting value or the next reference. So public is fine.
    public SLLNode next;

    public SLLNode(T value) {
        this.value = value;
    }

    public SLLNode(T value, SLLNode next) {
        this.value = value;
        this.next = next;
    }

    @Override
    public String toString() {
        return "SLLNode{"+ value + '}';
    }

}
