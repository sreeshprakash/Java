import java.io.*;
import java.util.*;

public class Solution {

   static boolean isAnagram(String A, String B) {
       
        char[] a=A.toLowerCase().toCharArray();
        char[] b=B.toLowerCase().toCharArray();
     
        Arrays.sort(a);
        Arrays.sort(b);

   return Arrays.equals(a,b);
   
   }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        
    }
}