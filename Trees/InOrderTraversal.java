class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class InOrderTraversal {

    Node root;

    public void inOrderTraversal(Node currentNode) {
        if (currentNode == null) {
            return;
        }

        inOrderTraversal(currentNode.left);
        System.out.print(currentNode.data + " ");
        inOrderTraversal(currentNode.right);
    }

    public static void main(String[] args) {

        InOrderTraversal tree = new InOrderTraversal();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.right.left = new Node(6);
        tree.root.left.right.right = new Node(7);
        tree.root.right.right = new Node(8);
        tree.root.right.right.left = new Node(9);


        System.out.println("Inorder traversal of binary tree is:");
        tree.inOrderTraversal(tree.root);
    }

}
