import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class LevelTravel {
public static void levelOrder(Node root) {
      Node curr=null;
      Node t=root;
      Queue<Node> q=new LinkedList<Node>();
      if(root==null){
          return;
      }
      q.add(root);
      while(!q.isEmpty()){
          curr=q.poll();
          if(curr.left!=null)
          q.add(curr.left);
          if(curr.right!=null)
          q.add(curr.right);
          System.out.print(curr.data+" ");
        }
      
    }

	public static Node insert(Node root, int data) {
if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        levelOrder(root);
    }	
}
