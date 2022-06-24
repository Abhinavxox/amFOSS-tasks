import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class evenFibonaaci {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        //t is no of test cases
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            long pointer1 = 0;
            long pointer2 = 2;
            long sum =2;
            while(pointer2<n){
                long pointer3 = (4 *pointer2)+pointer1;
                if(pointer3>n){
                    break;
                }
                pointer1 = pointer2;
                pointer2 = pointer3;
                sum+=pointer2;
            }
            System.out.println(sum);
        }
    }
}