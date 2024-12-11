public class BinaryTreeWithNodes {
    public static void main(String[] args) {
        MyBinaryTree<Integer> binaryTree = new MyBinaryTree<>();
        binaryTree.add(56);
        binaryTree.add(30);
        binaryTree.add(70);
        binaryTree.add(22);
        binaryTree.add(40);
        binaryTree.add(60);
        binaryTree.add(95);
        binaryTree.add(11);
        binaryTree.add(65);
        binaryTree.add(3);
        binaryTree.add(16);
        binaryTree.add(63);
        binaryTree.add(67);

        System.out.println("Size of the binary tree: " + binaryTree.getSize());
        System.out.println("Is 63 present in the tree?: " + binaryTree.search(63));
    }
}
