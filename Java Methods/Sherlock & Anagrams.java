import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);

    int t  = sc.nextInt();
    sc.nextLine();

    while(t>0)
    {
        String str = sc.nextLine();
        int count=0;

        for(int i=0;i<str.length()-1;i++)
        {
            List<String> list = new ArrayList<String>();
            for(int j=0;j<str.length()-i;j++)
            {
                list.add(str.substring(j,j+i+1));
            }
            //System.out.println(list);

            count += getAnagram(list);

        }
        System.out.println(count);

        t--;
    }
}


static int getAnagram(List<String> list)
{
    int counter=0;
    for(int i=0;i<list.size()-1;i++)
    {
        String temp = list.get(i);

        for(int j=i+1;j<list.size();j++)
        {
            counter += check(new StringBuilder(temp), new StringBuilder(list.get(j)));
        }
    }
    return counter;
}

static int check(StringBuilder a, StringBuilder b)
{
    //System.out.print(a+" "+b);
    boolean check =false;

    while(true)
    {

        if(a.length()==0 || b.length()==0)
        {
            break;
        }

        else
        {
            int i=0;
            check =false;
            for(int j=0;j<b.length();j++)
            {
                if(a.charAt(i)==b.charAt(j))
                {
                    a.deleteCharAt(i);
                    b.deleteCharAt(j);
                    check=true;
                }

            }

        }
        if(!check)
        {
            break;
        }


    }
    //System.out.print(" "+check);
    //System.out.println();

    if(!check)
    {
        return 0;
    }
    else
    {
        return 1;
    }
}
}