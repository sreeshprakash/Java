import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    String s = in.next();
    StringBuffer out1 = new StringBuffer("");
    int len = s.length();
    int cols = (int) Math.ceil(Math.sqrt(len));
    int rows=cols;
    for (int i = 0, p = 0; i < cols; i++, p++) {
        for (int j = 0; j < rows; j++) {
            try {
                out1.append(s.charAt(j*cols+p));
            } catch (Exception e) {
            }
        }
        out1.append(" ");

    }
    System.out.println(out1);
    }
}
