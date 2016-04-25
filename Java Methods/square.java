import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main (String[] args) throws java.lang.Exception 
    { 
    Scanner sc=new Scanner(System.in); 
    int test_case=sc.nextInt();
    for(int j=0;j<test_case;j++){
    double a=sc.nextDouble();
    double b=sc.nextDouble();
    double square=1;
    int i=1;
    int count=0;
    while(square<=b){
        square=Math.pow(i,2);
        if(square<=b){
            if(square>=a){
            count++;
            }
        }
        i++;

    }
    System.out.println(count);
    }
}
}