/* 
You are given an array of integers, your task is to find the next closest element, whose value is smaller than the current element. If there is no such element, print -1. Print the output array.

For example:

Input :- 4 3 1 2

Outout :- 3 1 -1 -1

Since, there are no smaller elements available for 1, 2 output -1. For the other ones, print the next closest smaller element.
*/



import java.io.*;
import java.util.*;

public class NextSmallerElement {

    public static void nextSmaller(int []array,int n){
        Stack<Integer> st=new Stack<Integer>();
        int []smaller=new int[n];
        for(int i=0;i<n;i++){
        smaller[i]=-1;
        }
        if(n==0){
         return;
       }
        else
        {
        for(int i=0;i<n;i++){
            if(st.empty()){
                st.push(i);
                continue;
            }           
            while(!st.empty() && array[st.peek()]>array[i]){
                    smaller[st.pop()]=array[i];
                }
            st.push(i);    
            }
            
        while(st.size()>0){
                 smaller[st.pop()]=-1;
             }
       for(int i=0;i<n;i++){
            System.out.print(smaller[i]+" ");
        }
        }
    }         
                          
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++)
                {
            array[i]=sc.nextInt();
        }
         nextSmaller(array,n);       
        }   
    }
