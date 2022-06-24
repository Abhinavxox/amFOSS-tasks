import java.io.*;
import java.util.*;

public class sandeshAndString {
    static String findPalindrome(String str) {
        
        int count[] = new int[256];
 
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
 
        String beg = "", mid = "", end = "";

        for (char ch = 'a'; ch <= 'z'; ch++) {
            // if the current character occurence is odd
            if (count[ch] % 2 == 1) {
            
                mid = String.valueOf(ch);
 
           
                count[ch--]--;
            } 
            // if the current character occurence is even
            else {

                for (int i = 0; i < count[ch] / 2; i++) {
                    beg += ch;
                }
            }
        }
 
        end = beg;
        end = reverse(end);
 
        return beg + mid + end;
    }
 
    static String reverse(String str) {
        String ans = "";
        char[] try1 = str.toCharArray();
 
        for (int i = try1.length - 1; i >= 0; i--) {
            ans += try1[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String cnt_n = sc.nextLine();
        String str = sc.nextLine();
        String rev = findPalindrome(str);
        System.out.println(rev.length());
        System.out.println(rev);
    }
}