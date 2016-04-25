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
            int n = in.nextInt();
            int temp = n;
            int count = 0;
            while(temp > 0){
            int d = temp % 10;
            if(d != 0 && n%d == 0){
                count++;
            }
            temp /= 10;
        }
        System.out.println(count);
            
        }
    }
}
