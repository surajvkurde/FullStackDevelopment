import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class QuickMedian {

    public static int quickSort(int[] a, int si, int ei,int index)
    {
        if(si==ei)
            return a[si];
        if(si<ei)
        {
            int pi=partition(a,si,ei);
            if(pi==index)
                return a[pi];
            else if(pi>index)
                return quickSort(a,si,pi-1,index);
            else
                return quickSort(a,pi+1,ei,index);
        }
        
        return 0;
    }

    private static int partition(int[] a, int si, int ei) {

        int x = a[ei];
        int i = si-1 ;
        int j = si ;
        
        for(;j<ei;++j)
        {
              if(a[j]<=x)  
              {
                  ++i;
                  int temp = a[i];
                  a[i]=a[j];
                  a[j]=temp;
              }
        }
        
        a[ei]=a[i+1];
        a[i+1]=x;
        
        return i+1;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] arr = new int[N];
        
        for(int i=0;i<N;++i)
            arr[i]=sc.nextInt();
        
        System.out.println(quickSort(arr, 0, N-1,N/2));
    }
}

