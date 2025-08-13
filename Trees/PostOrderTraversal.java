
import java.util.LinkedList;
import java.util.List;

public class PostOrderTraversal {

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
        PostOrderTraversal solution = new PostOrderTraversal();
        List<Integer> result = solution.postorderTraversal(root);

        // Expected output: [1, 2, 4, 5, 3]
        System.out.println("Preorder Traversal: " + result);

    }

    private List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList();
        this.postOrderHelper(root, result);
        return result;
    }

    private void postOrderHelper(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        System.out.println("left-->" + node.val);

        postOrderHelper(node.left, result);

        postOrderHelper(node.right, result);
        result.add(node.val);
    }
}
