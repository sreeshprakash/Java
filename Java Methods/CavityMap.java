import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line;
        int n,i,j;
        n = sc.nextInt();
        char [][]CharArray = new char[n][n];
        for(i=0;i<n;i++){
            line = sc.next();
            CharArray[i]= line.toCharArray();
        }
        for(i=1;i<n-1;i++){
            for(j=1;j<n-1;j++){
                if(CharArray[i][j] > CharArray[i][j-1] & CharArray[i][j] > CharArray[i][j+1] & CharArray[i][j] > CharArray[i-1][j] & CharArray[i][j] > CharArray[i+1][j])
                    CharArray[i][j] = 'X';
            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(CharArray[i][j]);
            }
            System.out.println();
        }
    }
}
