import sun.swing.BakedArrayList;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Arshad on 9/28/2016.
 */
public class MyBinaryTree<E> {
    private int index = 0;
    private TreeNode<E> root;

    public MyBinaryTree() {
        index = 0;
        root = null;
    }

    public void add(E info) {
      /*
       * Additions are done from the leftmost.  Thus, the first node
       * (index 0) is the root; the second node (index 1) is the left
       * child of the root, the third node (index 2) is the right child
       * of the root.  The fourth node (index 3) will be the left child
       * of the node at index 1.  And so +on.
       *
       * To give you some context, the node having index 0 occurs at
       * level 0, the nodes having indexes 1 and 2 occur at level 1,
       * the nodes having index 3,4,5 occur at level 2. */

        TreeNode<E> node = new TreeNode<E>(info);

        if (index == 0) {
            root = node;
        } else if (index == 1) {
            root.left = node;
        } else if (index == 2) {
            root.right = node;
        } else if (index == 3) {
            root.left.left = node;
        } else if (index == 4) {
            root.left.right = node;
        } else if (index == 5) {
            root.right.left = node;
        } else if (index == 6) {
            root.right.right = node;
        }

        index++;
    }

    public void preOrderTraversal_p() {
        preOrderTraversal(root);
    }

    public void preOrderTraversal(TreeNode<E> t) {
        if (t != null) {
            System.out.print(t.info + " ");
            preOrderTraversal(t.getLeft());
            preOrderTraversal(t.getRight());
        }
    }

    public void preorderIterativeTraversal_p() {
        preorderIterativeTraversal(root);
    }

    public void preorderIterativeTraversal(TreeNode<E> t) {
        Stack<TreeNode<E>> stack = new Stack<>();
        ArrayList<TreeNode<E>> arrayList = new ArrayList<>();
        TreeNode<E> current = t;
        if (t!=null){
            stack.push(t);
        }
        while (!stack.isEmpty()) {
           TreeNode<E> tempNode = stack.pop();
            arrayList.add(tempNode);
            if (tempNode.right!=null){
                stack.push(tempNode.right);
            }
            if (tempNode.left!=null){
                stack.push(tempNode.left);
            }

        }

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i).info + " ");
        }

    }


    public class TreeNode<E> {
        private TreeNode<E> left, right;
        private E info;

        public TreeNode(E info) {
            left = right = null;
            this.info = info;

        }

        public TreeNode<E> getLeft() {
            return left;
        }

        public TreeNode<E> getRight() {
            return right;
        }
    }

    public static void main(String[] args) {
        MyBinaryTree<Integer> bt = new MyBinaryTree<>();
        bt.add(1);
        bt.add(2);
        bt.add(3);
        bt.add(4);
        bt.add(5);
        bt.add(6);
        bt.add(7);
        bt.preorderIterativeTraversal_p();
    }
}
