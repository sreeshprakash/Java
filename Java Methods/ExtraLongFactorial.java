import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
    Integer n = in.nextInt();
     BigInteger b =BigInteger.valueOf(1);
     for(Integer i=1;i<=n;i++)
         b=b.multiply(BigInteger.valueOf(i));
     System.out.println(b); 
    }
}
