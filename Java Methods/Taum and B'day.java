import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long b = in.nextInt();
            long w = in.nextInt();
            long x = in.nextInt();
            long y = in.nextInt();
            long z = in.nextInt();
            
            long cost = 0;
            if(x+z < y)
                cost = (b*x)+(w*(x+z));
            else if(y+z < x)
                cost = (b*(y+z))+(w*y);
            else
                cost = (b*x)+(w*y);
            System.out.println(cost);
        }
    }
}
