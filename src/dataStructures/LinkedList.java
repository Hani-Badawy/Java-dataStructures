
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
    Constructs an empty linked list
    */
    public LinkedList() {
        head = tail = null;
        length = 0;
    }
    
    public void add(SLLNode node)
    {
        if(isEmpty())
        {
            head = tail = node;
        }
        else {
            tail.next=node;
            tail = node;
        }
        length++;
    }
    
    public void add(T value)
    {
        
    }
    
    public boolean isEmpty()
    {
        return length==0;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Length:\t");
        builder.append(length);
        builder.append("\nData:\t");
        SLLNode node = head;
        builder.append(node);
        builder.append('\t');
        for (int i = 0; i < length; i++) {
            builder.append(node);
            builder.append('\t');
            node= node.next;
        }
        return builder.toString();
    }
    
    
}
