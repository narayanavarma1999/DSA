import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterationInOrderTraversal {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        List<Integer> result = inorderTraversal(root);
        System.out.println("The In Order Traversal using iterative approach is " + result);
    }

    private static List<Integer> inorderTraversal(TreeNode node) {

        List<Integer> result = new ArrayList<>();
        TreeNode currNode = node;
        Stack<TreeNode> stack = new Stack<>();

        while (currNode != null || !stack.isEmpty()) {

            while (currNode != null) {
                stack.add(currNode);
                currNode = currNode.left;
            }
            currNode = stack.pop();
            result.add(currNode.val);

            currNode = currNode.right;
        }
        return result;

    }
}
