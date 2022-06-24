import java.io.*;
import java.util.*;

public class buildingTowers1 {

      static void frequencyNumber(int arr[], int size)
    {
        
        HashMap<Integer, Integer> freqMap
            = new HashMap<Integer, Integer>();
 
        for (int i=0;i<size;i++) {
            if (freqMap.containsKey(arr[i])) {
                freqMap.put(arr[i], freqMap.get(arr[i]) + 1);
            }
            else {
                freqMap.put(arr[i], 1);
            }
        }
 
       //printing the max and size
        System.out.print(Collections.max(freqMap.values()));
        System.out.print(" ");
        System.out.print(freqMap.size());
    }
 
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < arr.length; i++ ) {
            arr[i] = in.nextInt();
        }
        frequencyNumber(arr,arr.length);
    }
    
}