/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataStructures;

import java.util.Iterator;

/**
 *
 * @author Hani Mohammed
 * @param <T>
 */
public class ArrayIterator<T> implements Iterator<T> {
    
    private Array<T> array;
    private int index;
    public ArrayIterator(Array array) {
        this.array = array;
        index = 0; 
    }

    @Override
    public boolean hasNext() {
       return index<array.getLength()-1;
    }

    @Override
    public T next() {
        return array.getElementAt(index++);
    }
}
