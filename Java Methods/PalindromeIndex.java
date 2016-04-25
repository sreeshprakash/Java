import java.util.*;

public class PalindromeIndex {

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int numberOfInput = scan.nextInt();
    scan.nextLine();
    int flag;
    int i, j, k,result;
    while (numberOfInput != 0) {
        String phrase = scan.nextLine();
        int phraseLength = phrase.length();
        j = 0;
        k = 0;
        result=0;
        flag = 0;
        char[] firstArray = new char[phraseLength];
        for (char c : phrase.toCharArray()) {
            firstArray[k] = c;
            k++;
        }
        //System.out.println("phraseLength" + phraseLength);
        if (phraseLength == 1) {
            System.out.print(-1);
        } else {
            for (i = 0, j = phraseLength - 1; i < j; i++, j--) {
                if (firstArray[i] != firstArray[j]) {
                    if (firstArray[i] != firstArray[j-1]) {
                        result = i;
                    }else{
                        result=j;
                    }
                    flag=1;
                    //  System.out.println("flag " + flag);
                    break;
                }

            }

            if (flag == 1) {
                System.out.println(result);
            } else {
                System.out.println(-1);
            }
        }

        numberOfInput--;
    }
}
}
