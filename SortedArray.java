import java.io.*;
import java.util.*;
import java.lang.*;	

public class SortedArray{

        public static void main(String []args)
        {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str[]=new String[n];
        
        for(int i=0;i<n;i++)
        {
        	str[i]=sc.next();
        }
        
        boolean done=true;
                
        //ascending
        for(int i=0;i<n-1;i++)
        {
           if((str[i].compareTo(str[i+1]))!=-1)
        	{
        	done=false;
        	break;
        	}

        }
        if(done)
           {
        	System.out.println("INCREASING");
            }
        else 
          {
		//descending
		done=true;
		
		for(int i=0;i<n-1;i++)
		{
		   if((str[i].compareTo(str[i+1]))!=1)
			{
			  done=false;
			  break;
			}

		}
		if(done)
		{
			System.out.println("DECREASING");
		}
		else
		{
			System.out.println("NEITHER");
		}	
        }
        
        
        }//main
 }
