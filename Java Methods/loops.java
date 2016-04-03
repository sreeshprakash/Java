import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    for (int i = 0; i < t; i++)
       {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        for (int j = 0; j < n; j++)
        {
            a+= b * Math.pow(2.0, (double)j);
            System.out.print(a + " ");
        }
    System.out.print("\n");
    }
    }
}