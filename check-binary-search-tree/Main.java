import java.util.*;

/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/

class Main{
    boolean checkBinarySearchTree(Node root, int left, int right){
        if (root == null){ return true; }
        if (left>=root.data || root.data>=right){ return false; }
        return checkBinarySearchTree(root.left, left, root.data) && checkBinarySearchTree(root.right, root.data, right);
    }
    
    boolean checkBST(Node root) {
        return checkBinarySearchTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        /*
        if (root == null || (root.left == null && root.right == null)){ return true; }
        if ((root.left).data>=root.data || root.data>=(root.right).data){ return false; }
        return checkBST(root.left) && checkBST(root.right);
        */
    } 
}