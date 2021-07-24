import java.io.*;
import java.util.*;

public class CloseArray {

        public static void closestNumbers(int a[]) {
    // Write your code here
    	int n=a.length;
        Arrays.sort(a); 
         
         	//create ArrayList object as we dont know how many pairs will be there
	    ArrayList<Integer> aList=new ArrayList<Integer>();
	    int diff=a[n-1]-a[0];	//difference for reference
	    for(int j=0;j<n-1;j++)      //comparing differencce of elements at current and next Index, so conditon is j<n-1
	    {
	     if((a[j+1]-a[j])<diff)
	      {
	 	//clear ArrayList and add new elements with minimum difference value and update diff value
	 	diff=a[j+1]-a[j];
	 	aList.clear();
	 	aList.add(a[j]);
	 	aList.add(a[j+1]);
	 	}
	    else if((a[j+1]-a[j])==diff)
	    	{
	    	aList.add(a[j]);
	 	aList.add(a[j+1]);
	    	}
	    }
	    for(int i=0;i<aList.size();i++)
	    {
	    	System.out.print(aList.get(i)+" ");
		}                   
	System.out.println(" ");
    }


    
    public static void main(String[] args) throws IOException {
    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        closestNumbers(arr);
        sc.close();
    }
}

