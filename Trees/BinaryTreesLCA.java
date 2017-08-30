/*
 * Method to find the Lowest Common Ancestor in a Binary Tree (BT not BST). 
 */
 
public class BinaryTree {

  Node findLCA(Node root, Node n1, Node n2) {
    if(root == null) {
        return null;
    }
    if(root == n1 || root == n2) }
        return root;
    }  
    Node left = findLCA(root.left, n1, n2);
    Node right = findLCA(root.right, n1, n2);
    if(left != null && right != null) {
        return root;
    } 
    if(left == null && right == null) {
        return null;
    }
    return left != null ? left : right;
  }
  
}
