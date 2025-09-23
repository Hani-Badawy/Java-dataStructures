
package dataStructures;

/**
 *
 * @author Hani Mohammed (Hani Badawy)
 */
public class Queue {

    int[] data;
    int front;
    int back;
    int capacity;
    int length;

    public Queue(int capacity) {
        this.capacity = capacity;
        data = new int[capacity];
        this.front = this.back = -1;
        this.length = back - front + 1;
    }

    public Queue() {
        this.capacity = 100;
        data = new int[capacity];
        this.front = 0;
        this.back = -1;
        this.length = back - front + 1;
    }

    public void enqueue(int element) {
        data[++back] = element;
        this.length = back - front + 1;
    }

    public int dequeue() throws Exception {
        if(this.length==1)
            reset();
        if (isEmpty()) {
            throw new Exception("Can't dequeue, the queue is empty");
        }
        else {
            front++;
        }
        this.length = back - front + 1;
        return data[front];
    }
    
    public int peek()
    {
        return data[front];
    }
    public boolean isEmpty() {
        return this.length == 0;
    }

    private void reset() {
        this.front= 0;
        this.back = -1;
        this.length = back - front + 1;
    }
}

