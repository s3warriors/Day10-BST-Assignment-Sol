public class MyBinaryTree<K extends Comparable<K>> {


    private class Node {
        K key;
        Node left, right;

        public Node(K key) {
            this.key = key;
            this.left = this.right = null;
        }
    }

    private Node root;

    public void add(K key) {
        root = addRecursive(root, key);
    }

    private Node addRecursive(Node current, K key) {
        if (current == null) {
            return new Node(key);
        }

        if (key.compareTo(current.key) < 0) {
            current.left = addRecursive(current.left, key);
        } else if (key.compareTo(current.key) > 0) {
            current.right = addRecursive(current.right, key);
        }

        return current;
    }

    public int getSize() {
        return getSizeRecursive(root);
    }
    // Method to search for a key in the tree
    public boolean search(K key) {
        return searchRecursive(root, key);
    }

    private boolean searchRecursive(Node current, K key) {
        if (current == null) {
            return false; // Key not found
        }

        if (key.equals(current.key)) {
            return true; // Key found
        }

        // Recursively search the left or right subtree
        return key.compareTo(current.key) < 0
                ? searchRecursive(current.left, key)
                : searchRecursive(current.right, key);
    }
    private int getSizeRecursive(Node current) {
        return current == null ? 0 : 1 + getSizeRecursive(current.left) + getSizeRecursive(current.right);
    }
}
