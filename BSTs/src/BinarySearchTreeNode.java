/**
 * Created by Arshad on 10/20/2016.
 */

/**
 *Binary Search Tree Declaration
 */
public class BinarySearchTreeNode<E> {
    private int data;
    private BinarySearchTreeNode<E> left;
    private BinarySearchTreeNode<E> right;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BinarySearchTreeNode<E> getLeft() {
        return left;
    }

    public void setLeft(BinarySearchTreeNode<E> left) {
        this.left = left;
    }

    public BinarySearchTreeNode<E> getRight() {
        return right;
    }

    public void setRight(BinarySearchTreeNode<E> right) {
        this.right = right;
    }
    public BinarySearchTreeNode<E> find(BinarySearchTreeNode<E> root, int data){
        if(root == null) {
            return null;
        }
        if(data< root.getData()){
            return find(root.getLeft(), data);
        }
        else if(data > root.getData()){
            return find(root.getRight(),data);
        }
        return root;
    }

    /**
     *
     * @param root node
     * @returns the minimum(leftmost) element in the tree.
     */
    public BinarySearchTreeNode<E> findMinimum(BinarySearchTreeNode<E> root){

        if (root == null)
            return null;
        else{
            if (root.getLeft()==null){
                return root;
            }
            else{
                return findMinimum(root.getLeft());
            }
        }
    }

    /**
     *
     * @param root node
     * @returns the maximum (rightmost ) element in the tree.
     */
    public BinarySearchTreeNode<E> findMaximum(BinarySearchTreeNode<E> root){
        if(root == null){
            return null;
        }
        else{
            if(root.getRight()==null){
                return root;
            }else{
                return findMaximum(root.getRight());
            }
        }
    }
 public BinarySearchTreeNode<E> findMaxIteratively(BinarySearchTreeNode<E> root){
     BinarySearchTreeNode<E> temp = null;
     if (root == null){
         return null;
     }
     else{

         while(root.getRight()!=null){
             temp = root.getRight();
         }
     }
     return temp;
 }
}
