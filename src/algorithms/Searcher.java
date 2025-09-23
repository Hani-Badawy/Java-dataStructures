
package algorithms;

/**
 *
 * @author Hani Mohammed (Hani Badawy)
 * @param <T>
 */
public class Searcher<T extends Comparable> {
    
    private T[] data; 
    private int length;

    public Searcher(T[] data) {
        this.data = data;
        this.length = data.length;
    }
    
    public void setData(T[] data)
    {
        this.data = data;
        length = data.length;
    }
    public int linearSearch(T value)
    {
        for (int i = 0; i<length;i++)
        {
            if (data[i].equals(value))
                return i;
        }
        return -1;
    }
    
    /**
     * Performs binary search. 
     * Data must be sorted.
     * @param value
     * @return 
     */
    public int binarySearch(T value)
    {
        return -1;
    }
}
