import java.util.*;
import java.io.*;

public class GCD
{
public static void main(String []arg)
{
int a,b;
int gcd=1;
int min;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
min=Math.min(a,b);
while(min>0)
{
gcd=gcd*min;
min--;
}
System.out.println(gcd);
}
}
