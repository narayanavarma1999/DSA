import java.util.*;

public class IterationPreOrderTraversal {

    public static void main(String[] args) {
        
        TreeNode root = new TreeNode(1);
       
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        List<Integer> result = preOrderTraversal(root);
        System.out.println("The Pre Order Traversal using iterative approach is " + result);

    }

    private static List<Integer> preOrderTraversal(TreeNode node) {

        List<Integer> result = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();

        stack.push(node);

        while (!stack.isEmpty()) {

            TreeNode current = stack.pop();

            if (current.right != null) {
                stack.add(current.right);
            }

            if (current.left != null) {
                stack.add(current.left);
            }

            result.add(current.val);

        }
        return result;

    }

}