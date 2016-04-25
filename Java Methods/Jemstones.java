import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
    Scanner scan  = new Scanner(System.in);
    int numString = scan.nextInt();
    int count = 0;
    int [] arrayChars = new int[26];
    Set<Character> charSet = new HashSet<Character>();

    for(int i = 0; i< numString; i++) {
        String str = scan.next();


        for (char c : str.toCharArray()) {
          charSet.add(c);
        }

        for (char s : charSet) {
            int x = (int)s-97;
            arrayChars[x]++;

            if(arrayChars[x] >= numString){
                count++;
            }
        }

        charSet.clear();      
    }

    System.out.println(count); 
        
    }
}