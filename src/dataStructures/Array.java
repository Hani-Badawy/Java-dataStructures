
package dataStructures;

/**
 *
 * @author Hani Mohammed (Hani Badawy)
 */

/**
 * 
 * This class is a wrapper around Java array, but it allows different operations, like push_back and delete which are typically O(n).
 * @param <T>
 */
public class Array<T> {
    T[] data;
    int length;
    int capacity;
    final int  MAX_CAPACITY = 1000;
    public Array(T[] data) {
        this.data = data;
        this.capacity = MAX_CAPACITY;
        length = data.length;
    }

    public Array(T[] data, int capacity) {
        this.data = data;
        this.capacity = capacity;
        length = data.length;
    }

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
    
    public void push_back(T element)
    {
       T[] newData = (T[])new Object[length+1];
       System.arraycopy(data, 0, newData, 0, length);
       newData[length++] = element;
    }
    
}
