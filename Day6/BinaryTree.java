//constructor:The main purpose of a constructor is to initialize an object of a class.
import java.util.*;
class Node{
    int val;
    Node left,right;
    public Node(int value){
        this.val = value;
        this.left = null;
        this.right = null;
    }
}
public class BinaryTree{
    Node root;
    public BinaryTree(){
        root=null;
    }
    // Insert a node into the tree
    public void insert(int value){
        root = insertRec(root,value);
    }
    private Node insertRec(Node root, int value){
        if(root==null){
            root  = new Node(value);
            return root;
        }
        if(root.val>value){
            root.left = insertRec(root.left, value);
        }
        if(root.val<value){
            root.right = insertRec(root.right, value);
        }
        return root;
    }
    public void inorder(){
        inorderRec(root);
    }
    //Find parent and child nodes in the tree
    public Node findParent(int value){
        return findParentRec(root, value, null);
    }
    private Node findParentRec(Node root, int value, Node parent){
        if(root==null)
            return null;
        if(root.val==value)
            return parent;
        Node left = findParentRec(root.left, value, root);
        if(left!=null)
            return left;
        return findParentRec(root.right, value, root);
    }
    public void inorderRec(Node root){
        if(root!=null){
            inorderRec(root.left);
            System.out.print(root.val + " ");
            inorderRec(root.right);
        }
    }
    public boolean searchNode(int value){
        return searchNodeRec(root, value);
    }
    private boolean searchNodeRec(Node root, int value){
        if(root==null)
            return false;
        if(root.val==value)
            return true;
        return searchNodeRec(root.left, value) || searchNodeRec(root.right, value);
    }
    public static void main(String[] args){
        int n,k,h;
        BinaryTree tree = new BinaryTree();
        @SuppressWarnings("resource")
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes:");
        n=Sc.nextInt();
        for(int i=0;i<n;i++){
            k=Sc.nextInt();
            tree.insert(k);
        }
        System.out.println("Inorder traversal of binary tree is:");
        tree.inorder();
        System.out.println("Enter the node to which you want to find parent:");
        h=Sc.nextInt();
        Node parent = tree.findParent(h);
        if(parent==null)
            System.out.println("No parent found");
        System.out.println("Parent of "+h+" is "+parent.val);
        System.out.println("Enter the value to search:");
        int searchValue = Sc.nextInt();
        if(tree.searchNode(searchValue)){
            System.out.println(searchValue+" is present in the tree");
        }
        else {
            System.out.println(searchValue+" is not present in the tree");
        }
    }

}