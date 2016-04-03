import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];
        int maxUnique = 0;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            arr[i] = num;
        }
        HashSet<Integer> set = new HashSet<Integer>(m);
        for(int i = 0; i < arr.length-m;i++){
            for(int j = 0; j < m;j++){
                //System.out.print(arr[i+j]+"  ");
                set.add(arr[i+j]);
            }
            int size = set.size();
            //System.out.println("size is "+size+" max is "+maxUnique);
            if(size>maxUnique)
               maxUnique = size;
        }
        System.out.println(maxUnique);
    }
}