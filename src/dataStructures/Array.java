
package dataStructures;

import java.util.Iterator;

/**
 *
 * @author Hani Mohammed (Hani Badawy)
 */

/**
 * 
 * This class is a wrapper around Java array, but it allows different operations, like push_back and delete which are typically O(n).
 * @param <T>
 */
public class Array<T> implements Iterable<T>{
    private T[] data;
    private int length;
    private int capacity;
    final int  MAX_CAPACITY = 1000;


    public Array(int capacity) {
        this.capacity = capacity;
        data = (T[])new Object[capacity];
        length = 0;
    }

    public Array() {
        capacity = MAX_CAPACITY;
        data = (T[])new Object[capacity];
        length = 0;
    }
    
    public T getElementAt(int index)
    {
        return data[index];
    }
    
    public void push_back(T element)
    {
       T[] newData = (T[])new Object[length+1];
       System.arraycopy(data, 0, newData, 0, length);
       newData[length++] = element;
       data = newData;
    }
    
    /**
     * We can just set the length to length-1, without having to copy the data
     * This will result in O(1) operation.
     */
    public void pop()
    {
        length--;
    }
    
    public void insert(int index, T element)
    {
        T[] newData = (T[])new Object[length+1];
        System.arraycopy(data, 0, newData, 0, index);
        
        newData[index] = element;
        for (int i = index+1; i<length+1; i++)
            newData[i] = data[i-1];
        data = newData;
        length++;
    }
    
    public void remove(int index)
    {
        T[] newData = (T[])new Object[length-1];
        System.arraycopy(data, 0, newData, 0, index);
        
        for (int i = index+1; i<length; i++)
            newData[i-1] = data[i];
        data = newData;
        length--;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Length:\t");
        builder.append(length);
        builder.append("\nData:\t");
        for (int i = 0; i<length;i++)
        {
            builder.append(data[i]);
            builder.append('\t');
        }
     return builder.toString();
    }

    @Override
    public Iterator<T> iterator() {
        ArrayIterator<T> iterator = new ArrayIterator<>(this);
        return iterator;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getLength() {
        return length;
    }
}
