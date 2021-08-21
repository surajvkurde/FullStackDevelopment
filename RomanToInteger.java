
/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
For example, 2 is written as II in Roman numeral, just two one's added together.
12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

*/

class RomanToInteger {
    public int romanToInt(String s) {
        int l=s.length();
        int sum=0;
        int prev=0,curr=0;
        for(int i=l-1;i>=0;i--){
            char c=s.charAt(i);
            switch(c){
                case 'I':
                    curr=1;
                    break;
                case 'V':
                    curr=5;
                    break;
                case 'X':
                    curr=10;
                    break;
                case 'L':
                    curr=50;
                    break;
                case 'C':
                    curr=100;
                    break;
                case 'D':
                    curr=500;
                    break;
                case 'M':
                    curr=1000;
                    break;
            }
            if(curr>=prev){
                sum=sum+curr;
                prev=curr;
            }
            else{
                sum=sum-curr;
                prev=curr;
            }
        }
        return sum;
        
    }
}
