/*
 * Method to find the lowest common ancestor of a Binary Search Tree ( BST not BT). 
 */
 
public class BinarySearchTree {
  
  Node findLCA(Node root, Node n1, Node n2) {
      if(root.key > n1.key && root.key < n2.key) {
          return root;
      } else if(root.key > n1.key && root.key > n2.key) {
          return findLCA(root.left, n1, n2);
      } else if(root.key < n1.key && root.key < n2.key) {
          return findLCA(root.right, n1, n2);
      }
      return root;
  }
  
}
