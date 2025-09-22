
package dataStructures;

/**
 *
 * @author Hani Mohammed (Hani Badawy)
 */

/**
 * 
 * This class is a wrapper around Java array, but it allows different operations, like push_back and delete which are typically O(n).
 */
public class Array {
    int[] data;
    int length;
    int capacity;
    final int  MAX_CAPACITY = 1000;
    public Array(int[] data) {
        this.data = data;
        this.capacity = MAX_CAPACITY;
        length = data.length;
    }

    public Array(int[] data, int capacity) {
        this.data = data;
        this.capacity = capacity;
        length = data.length;
    }

    public Array(int capacity) {
        this.capacity = capacity;
        data = new int[capacity];
        length = 0;
    }

    public Array() {
        capacity = MAX_CAPACITY;
        data = new int[capacity];
        length = 0;
    }
    
    public void push_back(int element)
    {
       int[] newData = new int[length+1];
       for (int i = 0; i<length; i++)
           newData[i] = data[i];
      
       newData[length++] = element;
    }
    
}
