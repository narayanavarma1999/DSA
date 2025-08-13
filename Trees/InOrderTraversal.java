import java.util.ArrayList;
import java.util.List;

public class InOrderTraversal {

    public static void main(String[] args) {

        // Build the binary tree
        // Example tree:
        //      1
        //     / \
        //   2     3
        //  / \
//         4   5

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Test the recursive solution
        InOrderTraversal solution = new InOrderTraversal();
        List<Integer> result = solution.inorderTraversal(root);

        // Expected output: [1, 2, 4, 5, 3]
        System.out.println("Preorder Traversal: " + result);

    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        traversal(root, result);
        return result;
    }

    private void traversal(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }

        traversal(node.left, result);
        result.add(node.val);
        traversal(node.right, result);

    }

}
