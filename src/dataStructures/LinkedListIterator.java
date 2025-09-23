/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataStructures;

import java.util.Iterator;

/**
 *
 * @author hani2
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
