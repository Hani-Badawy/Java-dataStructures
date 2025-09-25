
package dataStructures;

/**
 *
 * @author Hani Mohammed (Hani Badawy)
 * @param <T>
 */
public class BSTNode<T extends Comparable<T>> implements Comparable<BSTNode<T>>{
    private T value;
    BSTNode<T> left,right;

    public BSTNode(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public BSTNode<T> getLeft() {
        return left;
    }

    public void setLeft(BSTNode<T> left) {
        this.left = left;
    }

    public BSTNode<T> getRight() {
        return right;
    }

    public void setRight(BSTNode<T> right) {
        this.right = right;
    }
    
    public boolean isLeaf()
    {
        return (left==null && right == null);
    }

    @Override
    public String toString() {
        return "Node{" + "value=" + value + '}';
    }

    @Override
    public int compareTo(BSTNode<T> other) {
        return value.compareTo(other.value);
    }
}
