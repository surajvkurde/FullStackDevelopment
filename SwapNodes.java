/* 
You are given a linked list, we have to swap every two consequent nodes and return the starting node after swapping, i.e., head and print the linked list. Values shouldn't be swapped, only nodes should be swapped. Suppose linked list is like 4->5->6->7->8 After swapping, it will look like 5->4->7->6->8

Input Format

    Input n, the no. of nodes in the linked list
    Next line inputs the value of the nodes of the linked list

Constraints

0<=n<=200 1<=nodeValue<=1000

Output Format

Return the updated head and print the linked list after swapping the nodes
*/

import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;


class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}

        public class SwapNodes {
            
            public static Node swapNode(Node head){
                Node temp=head;
                while(temp!=null && temp.next!=null){
                    int data=temp.data;
                    temp.data=temp.next.data;
                    temp.next.data=data;
                    temp=temp.next.next;
                }
                return head;
            }
            
            
            public static void main(String args[] ) throws Exception {
                Scanner sc=new Scanner(System.in);
                int n;
                n=sc.nextInt();
                Node head=null,temp=null;
                for(int i=0;i<n;i++){
                    int data=sc.nextInt();
                    if(head==null){
                        head=new Node(data);
                        temp=head;
                    }
                    else{
                        temp.next=new Node(data);
                        temp=temp.next;
                    }
                }
                Node head1=swapNode(head);
                
                while(head1!=null){
                    System.out.print(head1.data+" ");
                    head1=head1.next;
                }
                         
            }
        }
