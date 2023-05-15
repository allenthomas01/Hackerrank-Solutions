import java.io.*;
import java.util.*;

public class OutputFormat{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int num = sc.nextInt();
        System.out.printf("%-15s %03d",str,num);
    }
}   