public class BinarySearchTree {
    public static void main(String[] args) {
        MyBinaryTree<Integer> binaryTree = new MyBinaryTree<>();
        binaryTree.add(56);
        binaryTree.add(30);
        binaryTree.add(70);

        System.out.println("Size of the binary tree: " + binaryTree.getSize());
    }
}
