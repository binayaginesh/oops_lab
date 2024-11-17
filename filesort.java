import java.io.*;
import java.util.*;
import java.io.FileReader;

public class filesort {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("binaya.txt");
            Scanner sc = new Scanner(fr);

            
            int[] arr = new int[100];
            int n = 0;

        
            while (sc.hasNextInt()) {
                arr[n] = sc.nextInt(); 
             n++;
            }

        
            sc.close();

        
            Arrays.sort(arr, 0, n); 

        
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e;
        }
    }
}
