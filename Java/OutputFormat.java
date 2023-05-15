import java.io.*;
import java.util.*;

public class OutputFormat{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String str = sc.next(); //takes string till white space. i.e takes a single word
            int num = sc.nextInt();
            System.out.printf("%-15s%03d\n",str,num); 
            //%-15s left aligns the string to 15 characters.
            //%15s right aligns "    "   "    "  ...
        }
        System.out.println("================================");
        
        ;
    }
} 
