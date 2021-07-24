import java.util.*;
public class QuickFirst {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] arr = new int[n];
           for(int i=0;i<n;i++){
              arr[i]=in.nextInt(); 
           }
          
          partitionArray(arr,n);
          
           }     //main
      
      static void partitionArray(int a[],int n) {
          int pivot=a[0];
          int arrNew[]=Arrays.copyOf(a,n);
          int ni=0;
          for(int i=0;i<n;i++)
          {
              if(a[i]<pivot)
              {
                  arrNew[ni]=a[i];
                  ni++;
              }
          }
          arrNew[ni++]=pivot;
          for(int i=0;i<n;i++)
          {
              if(a[i]>pivot)
              {
                  arrNew[ni]=a[i];
                  ni++;
              }
          }
          //print Array after sorting 
           for(int i=0;i<n;i++){
              System.out.print(arrNew[i]+" "); 
      }
      }
  }//class
