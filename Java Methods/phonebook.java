//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();

    Map<String,Integer> phonebook = new HashMap<String, Integer>();
    {
        for(int i=0;i<n;i++)
        {
            String key = sc.nextLine();
            int value=sc.nextInt();
            phonebook.put(key, value);
            sc.nextLine();
        }
    }
    while(sc.hasNext())
    {
        String ptr=sc.nextLine();
        if(phonebook.containsKey(ptr))
        {
            System.out.println(ptr+"="+phonebook.get(ptr));
        }
        else
        {
            System.out.println("Not found");
        }
   }
}
}
