import java.io.*;
import java.util.*;

public class BubbleCount
{
static void bubbleSort(int a[])
{
int count=0;
int n=a.length;
for (int i = 0; i < n; i++) {
    
    for (int j = 0; j < n - 1; j++) {
        // Swap adjacent elements if they are in decreasing order
        if (a[j] > a[j + 1]) {
            int temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;
            count++;
        }
    }
 }
System.out.println("Array is sorted in "+count+ " swaps.");
System.out.println("First Element: "+a[0]);
System.out.println("Last Element: "+a[n-1]);
}

public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n>=2 && n<=600)
{
int arr[]=new int[n];
for(int i=0;i<n;i++)
	arr[i]=sc.nextInt();
bubbleSort(arr);
}
}//main

}//class
