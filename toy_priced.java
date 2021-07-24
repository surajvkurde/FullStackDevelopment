import java.io.*;
import java.util.*;
import java.lang.*;	

public class toy_priced{

   public static void main(String []args)
       {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
	int k=sc.nextInt();
	int toy[]=new int[n];
	if(n>=1 && n<=100000 )
	{
	for(int i=0;i<n;i++)
	{
		toy[i]=sc.nextInt();
	}
	
	int count=0;
	Arrays.sort(toy);
	
	for(int i=0;i<n;i++)
	{
	   if(k>=toy[i])
	    {
		count++;
		k=k-toy[i];
	   }
	}
	 System.out.println(count);
	}
        
      }//main
   }//class
