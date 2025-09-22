
package Main;

import dataStructures.Array;

/**
 *
 * @author Hani Mohammed
 */

public class AppDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Testing array
        Array<Integer> arr = new Array<>();
        for (int i =1;i<11;i++)
            arr.push_back(i);
        
        arr.pop();
        arr.insert(5, 50);
        arr.pop();
        arr.push_back(30);
        arr.remove(4);
        //print(arr);
        //print using the iterator
        for(var i: arr)
            print(i);
    }
    
    public static void print(Object obj)
    {
        System.out.println(obj);
    }
}
