
import java.io.*;
import java.util.*;

public class StdinStdout2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double d = sc.nextDouble();
        sc.nextLine();
        String str = sc.nextLine();
        
        System.out.println("String: "+str);
        System.out.println("Double: "+d);
        System.out.println("Int: "+num);
        sc.close();
    }
}

