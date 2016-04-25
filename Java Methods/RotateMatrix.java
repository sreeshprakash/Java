import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int rot=sc.nextInt();
        
    int[][] arr = new int[rows][cols];
    int[][] result = new int[rows][cols];
    for (int r = 0; r < rows; r++) {
        for (int c = 0; c < cols; c++) {
            arr[r][c] = sc.nextInt();
        }
    }

    rows--;
    cols--;
    for (int r = 0; r <= rows; r++) {
        for (int c = 0; c <= cols; c++) {
            int x = r < rows - r ? r : rows - r;
            int y = c < cols - c ? c : cols - c;
            int min = x < y ? x : y;
            int maxRow = rows - min;
            int maxCol = cols - min;
            int parameter = (maxRow + maxCol) * 2 - min * 4;

            int row = r;
            int col = c;
            for (int a = 0; a < rot%parameter; a++) {
                if (col == min && row < maxRow) {
                    row++;
                }
                else if (row == maxRow && col < maxCol) {
                    col++;
                }
                else if (row > min && col == maxCol) {
                    row--;
                }
                else if (row == min && col > min) {
                    col--;
                }
            }
            result[row][col] = arr[r][c];
        }
    }


    for (int r = 0; r <= rows; r++) {
        for (int c = 0; c <= cols; c++) {
            System.out.print(result[r][c] + " ");
        }
        System.out.print("\n");
    }
    }
}