import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int lenA = A.length();
        int lenB = B.length();
        int lenResult = lenA + lenB;
        System.out.println(lenResult);
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println((A.substring(0,1).toUpperCase() + A.substring(1)) + " " + (B.substring(0,1).toUpperCase() + B.substring(1)));
        
    }
}
