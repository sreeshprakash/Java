import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int page = 0;
        int special = 0;
        
        int[] arr= new int[n];
        for (int i=0; i<n; i++)
            {
            arr[i]= in.nextInt();
            for (int j=0; j<arr[i]; j++)
                {
                if (j%k == 0)
                    page++;
                if (j+1 == page)
                    special++;
            }
        }
        System.out.print(special);  
    }
}