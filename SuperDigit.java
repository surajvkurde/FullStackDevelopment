import java.io.*;
import java.util.*;

public class SuperDigit {

    public static void main(String[] args) {
        SuperDigit sd = new SuperDigit();
        Scanner sc = new Scanner(System.in);
        
        String str_n = sc.next();
        int k = sc.nextInt();
        
        int pSum = Integer.parseInt(sd.supDig(str_n));
        pSum *= k;
                        
        String sup = Integer.toString(sd.supDig(pSum));
        
        System.out.println(sup);
    }
    
    String supDig(String n) {
        if(n.length() == 1) return n;
        else {
            int np = 0;
            
            for(int i = 0; i < n.length(); i++) {
                np += Character.getNumericValue( n.charAt(i) );    
            }
            
            return supDig(Integer.toString(np));
        }       
    }
    
    int supDig(int n) {
        if(n / 10 == 0) return n;
        else {
            int r = 0;
            
            while(n > 0) {
                r += n % 10;
                n /= 10;
            }
            
            return supDig(r);
        }
    }
}
