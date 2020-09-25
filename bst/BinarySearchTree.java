package bst;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {

    private Node<T> root;

    @Override
    public Node<T> getMax() {

        if (this.root == null) {
            return null;
        }

        return getMaxNode(root);
    }

    @Override
    public Node<T> getMin() {

        if (this.root == null) {
            return null;
        }

        return getMinNode(root);
    }

    @Override
    public void insert(T data) {

        if (this.root == null) {
            this.root = new Node<>(data);
        } else {
            insertIntoTree(data, this.root);
        }
    }

    @Override
    public void remove(T value) {

        if (this.root == null) {
            return;
        }

        this.root = remove(value, root);
    }

    @Override
    public void traverseGraph() {
        if (this.root != null) {
            traverseInOrder(root);
        }
    }

    private Node<T> getMaxNode(Node<T> node) {

        if (node.getRightChild() != null) {
            return getMaxNode(node.getRightChild());
        }

        return node;
    }

    private Node<T> getMinNode(Node<T> node) {

        if (node.getLeftChild() != null) {
            return getMinNode(node.getLeftChild());           
        }

        return node;
    }

    private void insertIntoTree(T newData, Node<T> node) {
        
    	if (newData.compareTo(node.getData()) < 0) {
            if (node.getLeftChild() != null) {
                insertIntoTree(newData, node.getLeftChild());
            } else {
            	Node<T> newNode = new Node<>(newData);
                node.setLeftChild(newNode);            
            }
        } else {
            if (node.getRightChild() != null) {
                insertIntoTree(newData, node.getRightChild());
            } else {
            	Node<T> newNode = new Node<>(newData);
                node.setRightChild(newNode);
            }
        }
    }

    private Node<T> remove(T data, Node<T> node) {

        // base case for recursive method calls
        if (node == null) {
            return node;
        }

        // go to left: the data we are looking for is smaller
        if (data.compareTo(node.getData()) < 0) {
            Node<T> tempNode = remove(data, node.getLeftChild());
            node.setLeftChild(tempNode);
            // go to the right: the data we are looking for is greater
        } else if (data.compareTo(node.getData()) > 0) {
            Node<T> tempNode = remove(data, node.getRightChild());
            node.setRightChild(tempNode);
            // we have found the node to be removed
        } else {

            // node with one child or no children at all
            if (node.getLeftChild() == null) {
                Node<T> tempNode = node.getRightChild();
                node = null;
                return tempNode;
            } else if (node.getRightChild() == null) {
                Node<T> tempNode = node.getLeftChild();
                node = null;
                return tempNode;
            }

            // node has two children: problematic case
            // get the successor ... it is the node with smallest value in the right subtree
            Node<T> tempNode = getMinNode(node.getRightChild());
            node.setData(tempNode.getData());

            // we have to remove the in order successor !!!
            node.setRightChild(remove(tempNode.getData(), node.getRightChild()));

        }

        return node;
    }

    private void traverseInOrder(Node<T> node) {

        if (node.getLeftChild() != null) {
            traverseInOrder(node.getLeftChild());
        }

        System.out.print(node + " -> ");

        if (node.getRightChild() != null) {
            traverseInOrder(node.getRightChild());
        }
    }
}
