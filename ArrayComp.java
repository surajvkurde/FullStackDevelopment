package CodeForces;
import java.io.*;
import java.util.Scanner;

public class ArrayComp {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.next();
        }

        boolean done=true;  //flag

        //ascending
        for(int i=0;i<n-1;i++)
        {
            if(arr[i].compareTo(arr[i+1])!=-1)
            {
                done=false;
                break;
            }
        }

        if(done)
        {
            System.out.println("ASCENDING");
        }
        else
        {
            done=true;

            //DESCENDING

            for(int i=0;i<n-1;i++)
            {
                if(arr[i].compareTo(arr[i+1])!=1)
                {
                    done=false;
                    break;
                }
            }

            if(done)
            {
                System.out.println("Descending");
            }
            else
            {
                System.out.println("Neither");
            }
        }




    }

}
