
package dataStructures;

import java.util.Iterator;

/**
 *
 * @author Hani Mohammed (Hani Badawy)
 * @param <T>
 */
public class LinkedListIterator<T> implements Iterator<SLLNode> {

    private final LinkedList<T> linkedList;
    private SLLNode<T> current;
    private boolean justCreated;
    public LinkedListIterator(LinkedList<T> linkedList) {
        this.linkedList = linkedList;
        current = linkedList.head;
        justCreated = true;
    }

    @Override
    public boolean hasNext() {
        return current.next != null;
    }

    @Override
    public SLLNode<T> next() {
        if (justCreated )
        {
            current = linkedList.head;
            justCreated = false;
        }
        else
            current = current.next;
        return current;
    }

}
