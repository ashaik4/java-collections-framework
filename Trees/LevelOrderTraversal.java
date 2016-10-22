import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Arshad on 10/18/2016.
 */
public class LevelOrderTraversal<E> {
    private int index;        /* This is the index of the next node to insert
                                in the tree. */
    private TreeNode<E> root; /* The absolute root of the tree. */

    /*
     * Default constructor. */
    public LevelOrderTraversal()  {
        index = 0;
        root = null;
    }
    public void add(E info)
    {
      /*
       * Additions are done from the leftmost.  Thus, the first node
       * (index 0) is the root; the second node (index 1) is the left
       * child of the root, the third node (index 2) is the right child
       * of the root.  The fourth node (index 3) will be the left child
       * of the node at index 1.  And so on.
       *
       * To give you some context, the node having index 0 occurs at
       * level 0, the nodes having indexes 1 and 2 occur at level 1,
       * the nodes having index 3,4,5 occur at level 2. */

        TreeNode<E> node = new TreeNode(info);

        if (index == 0)  {
            root = node;
        }
        else if (index == 1)  {
            root.left = node;
        }
        else if (index == 2)  {
            root.right = node;
        }
        else if (index == 3)  {
            root.left.left = node;
        }
        else if (index == 4)  {
            root.left.right = node;
        }
        else if (index == 5)  {
            root.right.left = node;
        }
        else if(index == 6){
            root.right.right = node;
        }else if(index == 7){
            root.right.right.right = node;
        }

        index++;
    }
    protected static class TreeNode<E>  {
        private TreeNode<E> left,
                right;
        private E info;

        public TreeNode(E info) { left = right = null; this.info = info; }
        public TreeNode<E> get_left()  { return left; }
        public TreeNode<E> get_right() { return right;}
    }
    public void levelOrderTraversap_p(){
        levelOrderTraversal(root);
    }
    public void heightFinder(){
        int h = 0;
        h = height(root);
        System.out.println("height is:"+h);
    }
    public int height(TreeNode<E> t){
        int hl, hr,h = 0;

        if(t == null){
            return -1;
        }
        else{
            hl = height(t.left);
            hr = height(t.right);
            int maxValue = (hr>hl)?hr: hl;
            h = 1 + maxValue;
            return h;
        }
    }
    public void levelOrderTraversal(TreeNode<E> t){
        if (t == null) return;
        Queue<TreeNode<E>> q = new LinkedList<TreeNode<E>>();
        q.offer(t);
        while(!q.isEmpty()){
            TreeNode<E> tmp = q.poll();
            if(tmp!=null) {
                System.out.print(tmp.info+" ");
                if (tmp.left != null) {
                    q.offer(tmp.left);
                }
                if (tmp.right != null) {
                    q.offer(tmp.right);
                }
            }
        }
    }


    public static void main(String[] args)  {
        LevelOrderTraversal<Integer> bt = new LevelOrderTraversal<Integer>();

        bt.add(32);
        bt.add(40);
        bt.add(60);
        bt.add(9);
        bt.add(8);
        bt.add(15);
        bt.add(30);
        bt.add(7);
      /*
       * The above tree will look like:
       *                            32
       *                           /  \
       *                          /    \
       *                        40      60
       *                       / \      /\
       *                      /   \    /  \
       *                     9    8   15   30
       */

    bt.levelOrderTraversap_p();
        bt.heightFinder();
    }
}
