
package dataStructures;

import exceptions.EmptyTreeException;
import exceptions.NodeExistsException;

/**
 *
 * @author Hani Mohammed (Hani Badawy)
 * @param <T>
 */
public class BST<T extends Comparable<T>> {

    public BSTNode<T> root;
    private int size;
    private int depth;

    public BST(BSTNode<T> root) {
        this.root = root;
        depth = 1;
        size = 1;
    }

    public BST() {
        root = null;
        size = 0;
        depth = 0;
    }

    private void insert(BSTNode<T> node, BSTNode<T> root) throws NodeExistsException {

        if (node.getValue().compareTo(root.getValue()) < 0) {
            if (root.left != null) {
                insert(node, root.left);
            } else {
                root.left = node;
            }
        } else if (node.getValue().compareTo(root.getValue()) > 0) {
            if (root.right != null) {
                insert(node, root.right);
            } else {
                root.right = node;
            }
        } else {
            throw new NodeExistsException("Node exists");
        }
    }

    public void insert(BSTNode<T> node) throws NodeExistsException {
        if (root == null) {
            root = node;
        } else {
            insert(node, root);
        }
        size++;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public BSTNode<T> find(T value) {
        if (root == null) {
            return root;
        }

        return find(value, root);
    }

    private BSTNode<T> find(T value, BSTNode<T> root) {

        if (root.isLeaf()) {
            return root.getValue() == value ? root : null;
        } else {
            if (value.compareTo(root.getValue()) < 0) {
                return find(value, root.left);
            } else if (value.compareTo(root.getValue()) > 0) {
                return find(value, root.right);
            } else {
                return root;
            }
        }
    }

    private BSTNode<T> max(BSTNode<T> root) {
        if (root.right != null) {
            return max(root.right);
        } else {
            return root;
        }
    }

    private BSTNode<T> min(BSTNode<T> root) {
        if (root.left != null) {
            return min(root.left);
        } else {
            return root;
        }
    }

    public BSTNode<T> max() throws EmptyTreeException {
        if (root == null) {
            throw new EmptyTreeException("Tree is empty");
        } else {
            return max(root);
        }
    }

    public BSTNode<T> min() throws EmptyTreeException {
        if (root == null) {
            throw new EmptyTreeException("Tree is empty");
        } else {
            return min(root);
        }
    }

    public void delete(T value) throws Exception {
        if (this.root.isLeaf()) {
            if (this.root.getValue().compareTo(value) == 0) {
                this.root = null;
            } else {
                throw new Exception("Not found");
            }
        } else {
             BSTNode<T> parent = root;
             
             BSTNode<T> node = parent;
             while(true)
             {
                 if(node.getValue().compareTo(value)>0){
                    parent = node;
                    if(node.getLeft()!=null)
                        node = node.left;
                    else
                        throw new Exception("Not found");
                 }
                    
                 else if (node.getValue().compareTo(value)<0)
                 {
                     parent = node;
                     if (node.getRight() != null)
                        node = node.right;
                     else 
                          throw new Exception("Not found");
                 }    
                 else 
                     break;
             }
             if(node.isLeaf())
             {
                 if(parent.getLeft()==node)
                     parent.setLeft(null);
                 else if(parent.getRight()==node)
                     parent.setRight(null);
             }
             else
             {
                 BSTNode<T> selectedNode = min(node.right);
                 if (selectedNode == null)
                     selectedNode = max(node.left);
                 
                 if(parent.getLeft()==node)
                     parent.setLeft(selectedNode);
                 else if(parent.getRight()==node)
                     parent.setRight(selectedNode);
                 else // parent = node == root
                 {
                     root.getRight().setLeft(selectedNode.getRight());
                     swap(root, selectedNode);
                 }
                     //selectedNode.setLeft(node.getLeft());
             }
        }

    }

    public void swap(BSTNode<T> n1, BSTNode<T> n2) {
        T temp = n1.getValue();
        n1.setValue(n2.getValue());
        n2.setValue(temp);
    }

    private void preorder(BSTNode<T> node) {
        System.out.println(node);
        if (node.left != null) {
            preorder(node.left);
        }
        if (node.right != null) {
            preorder(node.right);
        }
    }

    public void preorder() {
        preorder(root);
    }

    private void postorder(BSTNode<T> node) {

        if (node.left != null) {
            postorder(node.left);
        }
        if (node.right != null) {
            postorder(node.right);
        }
        System.out.println(node);
    }

    public void postorder() {
        postorder(root);
    }

    private void inorder(BSTNode<T> node) {

        if (node.left != null) {
            inorder(node.left);
        }
        System.out.println(node);
        if (node.right != null) {
            inorder(node.right);
        }

    }

    public void inorder() {
        inorder(root);
    }
}

