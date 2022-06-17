import java.util.ArrayList;
import java.util.Scanner;

public class theGameIMustLose {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int N  = sc.nextInt();
            int M  = sc.nextInt();
            
            boolean a;
            if(N%2==0) {
                 a = true;
            }else {
                 a = false;
            }
            
            ArrayList<Integer> alist = new ArrayList<Integer>();
            int c = 0;
            if(a) {
                for(int i=0; i<=M; i ++) {
                    if(i%2 != 0) {
                        alist.add(i);
                        c++;
                    }
                }
                
                System.out.println(c);
                for(int i:alist) {
                    System.out.print(i+" ");
                }
            }else {
                System.out.println(0);
            } }
}