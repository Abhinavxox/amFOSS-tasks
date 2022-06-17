import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class problemSolvesVsDevelopers {

        public static void main(String[] args) {
        //input
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> alist = new ArrayList<Integer>();
        ArrayList<Integer> blist = new ArrayList<Integer>();

        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i=0; i<n; i++) {
            alist.add(sc.nextInt());
        }

        for(int i=0; i<m; i++) {
            blist.add(sc.nextInt());
        }
        //sorting in descending order
        Collections.sort(alist);
        Collections.reverse(alist);
        Collections.sort(blist);
        Collections.reverse(blist);
        
        boolean winning = true;
        
        //determination of wins
        if(n>m) {
            winning = false;
        }else {
            for(int i=0; i<n; i++) {
                if(blist.get(i)>alist.get(i)) {
                    continue;
                }else {
                    winning = false;
                }
            }
        }
        
        
        //determination of min power
        int min = 0;
        for(int i : alist) {
            for(int j = 0; j<m-1; j++) {
                int a = blist.get(j+1);
                int b = a-i;
                if(b<1) {
                    min+= blist.get(j);
                    break;
                }
                if(j==m-2) {
                    min+= blist.get(j+1);
                }
            }
        }
        

        if(winning) {
            System.out.println("YES");
            System.out.println(min);
        }else {
            System.out.println("NO");
        }
    }
}
