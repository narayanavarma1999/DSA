import java.util.Stack;

public class IterationPostTraversal {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        postOrderTraversal(root);
        System.out.println("The In Order Traversal using iterative approach is ");
    }

    private static void postOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();

        stack1.push(root);

        while (!stack1.isEmpty()) {
            TreeNode curr = stack1.pop();
            stack2.push(curr);

            if (curr.left != null)
                stack1.push(curr.left);
            if (curr.right != null)
                stack1.push(curr.right);
        }

        while (!stack2.isEmpty()) {
            System.out.print(stack2.pop().val + " ");
        }
    }
}
