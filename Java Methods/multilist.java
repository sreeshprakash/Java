import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        ArrayList al=new ArrayList(); ArrayList inal;
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    for(int i=0;i<n;i++)
    {
        inal=new ArrayList();
        int m=in.nextInt();
        for(int j=0;j<m;j++)
        {
            inal.add(in.next());
        }
        al.add(inal);
    }
    n=in.nextInt();
    for(int i=0;i<n;i++)
    {
        int m=in.nextInt();
        int k=in.nextInt();
        try{
        inal=(ArrayList) al.get(m-1);
        System.out.println(inal.get(k-1));
        }
        catch(Exception e)
        {
            System.out.println("ERROR!");
        }
    }
    }
}