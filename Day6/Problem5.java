//BFS and DFS for traversing a binary tree
import java.util.*;

class Node {
    int data;
    Node left, right;
    public Node(int item){
        data = item;
        left = right = null;
    }
}

public class Problem5 {
    Node root;
    
    Problem5(){
        root = null;
    }
    public void inser(int value){
        root = inserRec(root, value);
    }
    private Node inserRec(Node root,int value){
        if(root==null){
            root = new Node(value);
            return root;
        }
        if(value<root.data)
            root.left = inserRec(root.left, value);
        else if(value>root.data)
            root.right = inserRec(root.right, value);
        return root;
    }
    // Breadth-First Search
    public void BFS(){
        Queue<Node> queue = new LinkedList<>();
        if(root!=null){
            queue.add(root);
            while(!queue.isEmpty()){
                Node temp = queue.poll();
                System.out.print(temp.data + " ");
                if(temp.left!=null)
                    queue.add(temp.left);
                if(temp.right!=null)
                    queue.add(temp.right);
            }
        }
    }
    
    // Depth-First Search (Pre-Order)
    public void preOrder(Node node){
        if(node!=null){
            System.out.print(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    
    // Depth-First Search (In-Order)
    public void inOrder(Node node){
        if(node!=null){
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }
    
    // Depth-First Search (Post-Order)
    public void postOrder(Node node){
        if(node!=null){
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data + " ");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Problem5 tree = new Problem5();
        System.out.println("Enter the elements of binary tree (space separated) :");
        for(int i=0;i<7;i++){
            int k = sc.nextInt();
            tree.inser(k);
        }
        
        System.out.println("Breadth First Search:");
        tree.BFS();
        System.out.println("\nPre-Order Traversal:");
        tree.preOrder(tree.root);
    }
}
