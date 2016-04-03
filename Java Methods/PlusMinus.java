import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int pos=0, neg=0, frac=0;
        float posf, negf, fracf;
        
        
        for(int i=0; i<n; i++)
        {
                if (arr[i]<0)
                    neg++;
                else if (arr[i]>0)
                    pos++;
                else if (arr[i]==0)
                    frac++;
        }
        
        
        
        posf = (float) pos/n;
        negf = (float) neg/n;
        fracf = (float) frac/n;
        
        
        
        
        System.out.println(posf);
        System.out.println(negf);
        System.out.println(fracf);
        
    }
}