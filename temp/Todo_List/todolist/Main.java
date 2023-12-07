import java.util.Scanner;
import java.util.Arrays;
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        long tc;
        Scanner sc = new Scanner(System.in);
        tc = sc.nextInt();
        while(tc-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String inp = sc.nextLine();
            System.out.println(solve(inp));
        }
    }
    public static int solve(String s) {
        char[] arr = s.toCharArray();
        int same,dup;
        same = 0;
        dup = 0;
        for(int i = 0; i < arr.length-1; ) {
            if(arr[i] == arr[i+1]) same += 2;
            else if(arr[i] != arr[i+1]) dup += 2;
            i+=2;
        }
        return arr.length-(same+dup);

    }
    
}