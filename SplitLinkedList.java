/*
You are given a linked list. Your task is to print the node where we can split the linked lists into two parts of equal sum of nodes.

For example:

1 -> 2 -> 3 -> 4 -> 2 -> NULL

In this example we split the linked list at '4', so that now the two linked list become

1 -> 2 -> 3 -> NULL

4 -> 2 -> NULL

As you can see both the linked lists now have a sum equal sum of nodes

So the output is 4

Note: The sum of all the nodes is always even, and it is always possible to split the linked list into two equal parts.
*/

import java.io.*;
import java.util.*;

class linkedList{
    int val;
    linkedList next;
    linkedList(int data){
        val=data;
        next=null;
    }
}

public class SplitLinkedList {

    public static void main(String[] args) {
        linkedList head=null,temp=null;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int data;
        for(int i=0;i<n;i++){
            data=sc.nextInt();
            if(head==null){
                head=new linkedList(data);
                temp=head;
            }
            else{
                temp.next=new linkedList(data);
                temp=temp.next;
            }
        }
        int sum=0,midSum=0;
        temp=head;
        while(temp!=null){
            sum+=temp.val;
            temp=temp.next;
          // System.out.println(sum); 
        }
        
        temp=head;
        while(temp!=null){
            midSum+=temp.val;
            if(midSum==(sum/2))
                break;
            temp=temp.next;            
        }
        System.out.println(temp.next.val);         
    }
}
