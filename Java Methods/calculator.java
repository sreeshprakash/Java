import java.util.*;
import java.util.Scanner;

class myCalculator{ String power(int n, int p) throws Exception { 
if(n< 0 || p<0){ System.out.print("java.lang.Exception: n and p should be non-negative"); 
}else{ return ""+ (int)Math.pow(n, p); } return ""; 
} }

class Solution{

    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);

        while(in.hasNextInt())
        {
            int n = in.nextInt();
            int p = in.nextInt();
            myCalculator M = new myCalculator();
            try
            {
                System.out.println(M.power(n,p));
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }

    }
}

