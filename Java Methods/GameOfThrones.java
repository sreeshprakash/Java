import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
       public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    BitSet b = new BitSet();
    for(char c: str.toCharArray()){
        b.flip(c-'a');
    }
    System.out.println((b.cardinality()<=1)?"YES":"NO");
}
}
