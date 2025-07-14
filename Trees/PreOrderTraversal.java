public class PreOrderTraversal {
    
    Node root;

    void preorderTraversal(Node node) {
        if (node == null){
            return;
        }

        // Print root
        System.out.print(node.data + " ");

        // Recur on left
        preorderTraversal(node.left);

        // Recur on right
        preorderTraversal(node.right);
    }

    public static void main(String[] args) {
        PreOrderTraversal tree = new PreOrderTraversal();

        /* Construct the following binary tree
                  1
                /   \
               2     3
              / \   / \
             4   5 6   7
        */

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.println("Preorder traversal of binary tree is:");
        tree.preorderTraversal(tree.root);
    }
}
