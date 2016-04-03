import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   public static void main(String[] args) { Scanner sc = new Scanner(System.in);
    String d = sc.next();

    try {
        DateFormat df = new SimpleDateFormat("hh:mm:ssa");
        DateFormat out = new SimpleDateFormat("HH:mm:ss");
        Date date = df.parse(d);
        System.out.println(out.format(date));
    } catch (ParseException e) {
        e.printStackTrace();
    }

    sc.close();
}
}