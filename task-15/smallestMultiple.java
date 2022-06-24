import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class smallestMultiple {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(panlindrome(n));
        }
    }
     
    static int findGCD(int a, int b){
        if(b == 0)
          return a;
        return findGCD(b, a%b);
      }

    static long panlindrome(int n){
        int array[] = new int[n];
        for(int i=1; i<=n; i++){
            array[i-1] = i;
        }
        int lcm = array[0];
        int gcd = array[0];

        for(int i=1; i<array.length; i++){
          gcd = findGCD(array[i], lcm);
          lcm = (lcm*array[i])/gcd;
        }
        return lcm;
    }
}