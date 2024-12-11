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

    private int getSizeRecursive(Node current) {
        return current == null ? 0 : 1 + getSizeRecursive(current.left) + getSizeRecursive(current.right);
    }
}
