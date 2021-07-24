import java.io.*;
import java.util.*;


public class InsertionCount
{
    static void insertionSort1(int n, int arr[]) 
    {
    int count=0;
    for(int i=1;i<n;i++)
    {
        for(int j=i;j>0;j--)
    {
        if(arr[j-1]>arr[j])
        {
        
	int temp=arr[j];
        arr[j]=arr[j-1];
        arr[j-1]=temp;
        count++;
        }
       }
     }
        System.out.println(count);
      }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        if(n>=1 && n<=1000)
        {       
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        }
        insertionSort1(n, a);
         
        sc.close();
    }     
}

