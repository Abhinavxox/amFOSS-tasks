import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class multiplesOf3And5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //t is the no of test cases
        int t = in.nextInt();
        for(int i = 0; i<t; i++){

            long sum = 0;
            long number= in.nextInt();
            long x = (number-1)/3;
            long y = (number-1)/5;
            long z = y/3;
            //algo to find sum of multiples of 3
            sum += ((3)*(x*(x+1))/2);
            //algo to find sum of multiples of 5
            sum += ((5)*(y*(y+1))/2);
            //algo to remove the common multiples of 3 and 5
            sum -= ((15)*(z*(z+1))/2);
            System.out.println(sum);
        }
        
    }
}