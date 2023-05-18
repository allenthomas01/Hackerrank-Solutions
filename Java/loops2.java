import java.io.*;
import java.util.*;
import java.lang.Math;

public class loops2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
        
        int result=0;
        for(int i=0;i<n;i++){
            result = result+a;
            for(int j=0;j<b;j++){
                result =result+((int)Math.pow(2,j)* b);
                System.out.print(result+" ");
            }
        }
        
    }
}