import java.util.List;

public class PreTraversal {

    public static void main(String[] args) {

        // Build the binary tree
        // Example tree:
        // 1
        // / \
        // 2 3
        // / \
        // 4 5

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Test the recursive solution
        PreOrderTraversal solution = new PreOrderTraversal();
        List<Integer> result = solution.preorderTraversal(root);

        // Expected output: [1, 2, 4, 5, 3]
        System.out.println("Preorder Traversal: " + result);

    }
}
