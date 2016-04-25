import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        for (int j =0; j<=l; j++)
            {
        String s = sc.next();
        int n = s.length();
        int count = 0;
        int inc = 0;
        for (int i=0; i<n/2; i++)
            {
            inc = Math.abs(s.charAt(i)-s.charAt(n-i-1));
            count += inc;
        }
        System.out.println(count);
        }
        
    }
}