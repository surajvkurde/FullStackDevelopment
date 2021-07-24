import java.io.*;
import java.util.*;


public class InsertionS 
{
    static void insertionSort1(int n, int arr[]) 
    {
    int temp=arr[n-1];
    boolean done=false;
    for(int j=n-2;j>=-1;j--)
    {
        
    if(j!=-1) 
     {
        //index not below 0
        if(arr[j]>temp)
        {
            arr[j+1]=arr[j];
        }
        else
        {
            arr[j+1]=temp;
            //element inserted at right place
            done=true;
        }        
     }
    else
    {
        //index below 0,replace first element
        arr[0]=temp;
    }
    for(int k=0;k<n;k++)
        System.out.print(arr[k]+" ");
    System.out.println();
    if(done)
        break;
    }  
    }
    
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=1 && n<=1000)
        {
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        insertionSort1(n, arr);
        }     
        sc.close();
    }     
}import java.io.*;
import java.util.*;


public class InsertionS 
{
    static void insertionSort1(int n, int arr[]) 
    {
    int temp=arr[n-1];
    int j=n-1;
    while(arr[j-1]>temp)
    {
	arr[j]=arr[j-1];
	j--;
	}
     arr[j]=temp;
     }
    for(int k=0;k<n;k++)
            System.out.print(arr[k]+" ");
    System.out.println("");
    }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=1 && n<=1000)
        {
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        insertionSort1(n, arr);
        }     
        sc.close();
    }     
}

