import java.util.ArrayList;
import java.util.Scanner;

public class lisaAndShelves {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=1; i<=N; i++) {
            int m = N%i;
            if(m==0) {
                list.add(i);
            }
        }
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for(int i=0; i<list.size();i++) {
            list2.add(list.get(i)); 
            int a = N/list.get(i);
            list2.add(a);
        }
        
        System.out.println(list2.size()/2);
    }
}
