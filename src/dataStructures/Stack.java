
package dataStructures;

/**
 *
 * @author Hani Mohammed (Hani Badawy)
 * A better implementation than the Java Stack implementation.
 * As Java stack inherits the Vector class. 
 * @param <T>
 */
public class Stack<T> {
    private int top;
    private int capacity;
    private T[] data;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.data=(T[])new Object[capacity];
        this.top  = -1;
    }
    
    public void push(T element)
    {
        data[++top] = element;
    }
    
    public T pop()
    {
       return data[top--];
    }
    
    public T peek()
    {
        return data[top];
    }
    public int getSize()     
    {
        return top+1;
    }
    public boolean isEmpty()
    {
        return top==-1;
    }
}
