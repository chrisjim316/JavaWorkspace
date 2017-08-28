import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] nodes = input.split(" ");
        BinarySearchTree tree = new BinarySearchTree(); //hardcoding a BST to provide an example
        tree.insert(3); 
        tree.insert(80);
        tree.insert(52);
        tree.insert(33);
        tree.insert(20);
        tree.insert(10);
        tree.insert(28); // insert() automatically sorts the tree
        Node root = tree.getRoot(); //retrieve root
    }
}

class Node {
    public int key;
    Node left, right;
 
    public Node(int item) {
        key = item;
        left = right = null;
    }
}
    
class BinarySearchTree {
    // Root of BST
    Node root;
    
    // Constructor
    BinarySearchTree() { 
        root = null; 
    }
    
    Node getRoot() {
       return root; 
    }
 
    // This method mainly calls insertRec()
    void insert(int key) {
       root = insertRec(root, key);
    }
     
    // A recursive function to insert a new key in BST 
    Node insertRec(Node root, int key) {
        // If the tree is empty, return a new node 
        if (root == null) {
            root = new Node(key);
            return root;
        }
 
        // Otherwise, recur down the tree 
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);
 
        // return the (unchanged) node pointer 
        return root;
    }
}
