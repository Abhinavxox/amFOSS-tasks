import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class largestPalindrome {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();

            //
            long maxPalindrome = -1;

            for(long i=100; i<1000; i++){
                for(long j = i; j<1000; j++){
                    long product = i*j;
                    if(isPalindrome(product) && product> maxPalindrome && product<n){
                        maxPalindrome= product;
                    }
                }
            }
            System.out.println(maxPalindrome);
        }
    }

    static boolean isPalindrome(long n){
        long r,sum=0,temp;    
        temp=n;    
        while(n>0){    
         r=n%10;  //getting remainder  
         sum=(sum*10)+r;    
         n=n/10;    
        }    
        if(temp==sum) return true;  
        return false; 
    }
}