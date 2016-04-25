import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        for(int i=0;i<t;i++)
        {
            String input = in.nextLine();
            if(input.length()%2==0)
            {
                String first = input.substring(0,input.length()/2);
                String second = input.substring(input.length()/2,input.length());
                int count = 0;
                for(int j=0;j<first.length();j++)
                {
                    int index = second.indexOf(first.substring(j,j+1));
                    if(index!=-1)
                        second=second.substring(0,index)+second.substring(index+1);   
                    else
                        count++;
                }
                System.out.println(count);
            }
            else
                System.out.println(-1);
        }    
    }
}