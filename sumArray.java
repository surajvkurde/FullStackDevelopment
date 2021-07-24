import java.util.*;
import java.io.*;

public class sumArray
{
public static void main(String []arg)
{
int t;
Scanner sc=new Scanner(System.in);
t=sc.nextInt();
int c=0;
while(t>0)
{
c++;
int n =sc.nextInt();
if(n>=1&&n<=100)
{
int a[]= new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
int sum=sumArr(a,0);
System.out.println("Case "+ c +": "+sum);
sum=0;
}
t--;
}
}

static int sumArr(int []a,int index)
{
if(index==a.length)
	return 0;
return a[index]+sumArr(a,index+1);
}
}//class

