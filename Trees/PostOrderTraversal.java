import java.util.LinkedList;
import java.util.List;


public class PostOrderTraversal {

    Node root;

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        PostOrderTraversal tree = new PostOrderTraversal();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.right.left = new Node(6);
        tree.root.left.right.right = new Node(7);
        tree.root.right.right = new Node(8);
        tree.root.right.right.left = new Node(9);
        tree.postorderTraversal(tree.root, list);
        System.out.println(list);;

    }

    public List<Integer> postorderTraversal(Node root,List<Integer> list) {
        traversal(root, list);
        return list;
    }

    public static void traversal(Node currentNode, List<Integer> list) {
        if (currentNode == null) {
            return;
        }

        traversal(currentNode.left, list);
        traversal(currentNode.right, list);
        list.add(currentNode.data);
    }
}
