import java.io.*;
import java.util.*;

public class Solution {

static boolean check(String A, String B){
   char[] c=A.toLowerCase().toCharArray();
   char[] d=B.toLowerCase().toCharArray();
   int flag=0;
   int pos;
   int[][] letters=new int[26][2];
   for(int i=0;i<A.length();i++){
        pos=c[i]-'a';
        letters[pos][0]++;
        }
   for(int i=0;i<B.length();i++){
        pos=d[i]-'a';
        letters[pos][1]++;
        }
   for(int i=0;i<26;i++){
   if(letters[i][0]>0 && letters[i][1]>0){
       flag=1;
   break;}
   else{
       flag=0;
        }
       }
   if(flag==1)
        return true;
   else
        return false;
 }

public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t>0){
    String A=sc.next();
    String B=sc.next();
    boolean ret=check(A,B);
    if(ret)System.out.println("YES");
    else System.out.println("NO");
        t--;}
    }
}
